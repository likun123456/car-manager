package com.bruce.carmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.mapper.UserMapper;
import com.bruce.carmanager.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 41
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
}
