package com.bruce.carmanager.controller;

import com.bruce.carmanager.common.CommonResult;
import com.bruce.carmanager.dto.UserDTO;
import com.bruce.carmanager.service.ILoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 16:21
 */
@Api(tags = "登录")
@RestController
public class LoginController {

    @Resource
    private ILoginService iLoginService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public CommonResult<String> login(@RequestBody UserDTO dto) {
        return CommonResult.success(iLoginService.login(dto));
    }
}
