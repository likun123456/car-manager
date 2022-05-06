package com.bruce.carmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bruce.carmanager.common.enums.ResultEnum;
import com.bruce.carmanager.common.exception.BizException;
import com.bruce.carmanager.common.utils.JwtTokenUtil;
import com.bruce.carmanager.dto.UserDTO;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.service.ILoginService;
import com.bruce.carmanager.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 16:23
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private IUserService userService;

    @Override
    public String login(UserDTO dto) {
        UserEntity userEntity = userService.getOne(new QueryWrapper<UserEntity>().lambda()
                .eq(UserEntity::getUsername, dto.getUsername())
                .eq(UserEntity::getPassword, dto.getPassword()));
        if (userEntity == null) {
            throw new BizException(ResultEnum.USER_NOT_EXIST);
        }
        return JwtTokenUtil.getToken(dto);
    }
}
