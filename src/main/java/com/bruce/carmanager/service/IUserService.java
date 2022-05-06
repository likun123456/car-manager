package com.bruce.carmanager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.vo.LoginUserVO;

public interface IUserService extends IService<UserEntity> {

    LoginUserVO findByUsername(String username);
}
