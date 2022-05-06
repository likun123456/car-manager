package com.bruce.carmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.carmanager.convertor.vo.LoginUserVoConvertor;
import com.bruce.carmanager.convertor.vo.RoleVoConvertor;
import com.bruce.carmanager.entity.RoleEntity;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.entity.UserRoleEntity;
import com.bruce.carmanager.mapper.UserMapper;
import com.bruce.carmanager.service.IRoleService;
import com.bruce.carmanager.service.IUserRoleService;
import com.bruce.carmanager.service.IUserService;
import com.bruce.carmanager.vo.LoginUserVO;
import com.bruce.carmanager.vo.RoleVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 41
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    @Resource
    private LoginUserVoConvertor loginUserVoConvertor;

    @Resource
    private RoleVoConvertor roleVoConvertor;

    @Resource
    private IRoleService iRoleService;

    @Resource
    private IUserRoleService iUserRoleService;

    @Override
    public LoginUserVO findByUsername(String username) {
        UserEntity userEntity = super.getOne(new QueryWrapper<UserEntity>().lambda()
                .eq(UserEntity::getUsername, username));
        LoginUserVO loginUserVO = loginUserVoConvertor.po2Vo(userEntity);
        if (loginUserVO != null) {
            UserRoleEntity userRoleEntity = iUserRoleService.getOne(new QueryWrapper<UserRoleEntity>().lambda()
                    .eq(UserRoleEntity::getUserId, loginUserVO.getId()));
            if (userRoleEntity != null) {
                RoleEntity roleEntity = iRoleService.getById(userRoleEntity.getRoleId());
                RoleVO roleVO = roleVoConvertor.po2Vo(roleEntity);
                loginUserVO.setRole(roleVO);
            }
        }
        return loginUserVO;
    }
}
