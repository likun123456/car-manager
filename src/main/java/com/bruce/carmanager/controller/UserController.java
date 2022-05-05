package com.bruce.carmanager.controller;

import com.bruce.carmanager.common.utils.CommonResult;
import com.bruce.carmanager.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/get/{id}")
    @ApiOperation("根据id查询")
    public CommonResult<UserVO> get(@PathVariable("id") Integer id) {
        return CommonResult.success(null);
    }
}
