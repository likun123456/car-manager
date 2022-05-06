package com.bruce.carmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.carmanager.entity.UserRoleEntity;
import com.bruce.carmanager.mapper.UserRoleMapper;
import com.bruce.carmanager.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 15:59
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleEntity> implements IUserRoleService {
}
