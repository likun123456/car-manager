package com.bruce.carmanager.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.carmanager.dto.UserDTO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 16:23
 */
public interface ILoginService {

    String login(UserDTO dto);
}
