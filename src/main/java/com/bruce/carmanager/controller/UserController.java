package com.bruce.carmanager.controller;

import com.bruce.carmanager.common.CommonResult;
import com.bruce.carmanager.common.annotation.RequireAdmin;
import com.bruce.carmanager.convertor.dto.UserDtoConvertor;
import com.bruce.carmanager.convertor.vo.UserVoConvertor;
import com.bruce.carmanager.dto.UserDTO;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.service.IUserService;
import com.bruce.carmanager.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 42
 **/
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    @Resource
    private UserDtoConvertor userDtoConvertor;

    @Resource
    private UserVoConvertor userVoConvertor;

    @GetMapping("/get/{id}")
    @ApiOperation("根据id查询")
    public CommonResult<UserVO> get(@PathVariable("id") Integer id) {
        return CommonResult.success(null);
    }

    @PostMapping("/create")
    @ApiOperation("创建单个用户")
    @RequireAdmin
    public CommonResult<UserVO> create(@RequestBody UserDTO dto) {
        UserEntity userEntity = userDtoConvertor.dto2Po(dto);
        boolean save = iUserService.save(userEntity);
        if (save) {
            UserVO userVO = userVoConvertor.po2Vo(userEntity);
            return CommonResult.success(userVO);
        }
        return CommonResult.error();
    }

    @DeleteMapping("/delete")
    @ApiOperation("通过多个id删除用户")
    @RequireAdmin
    public CommonResult<Boolean> deleteByIds(@RequestParam("ids") String ids) {
        List<Long> list = Arrays.stream(ids.split(",")).map(Long::parseLong).collect(Collectors.toList());
        boolean remove = iUserService.removeByIds(list);
        return remove ? CommonResult.success(true) : CommonResult.error();
    }
}
