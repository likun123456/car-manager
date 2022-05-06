package com.bruce.carmanager.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.bruce.carmanager.dto.UserDTO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 15:18
 */
public class JwtTokenUtil {

    public static String getToken(UserDTO dto) {
        return JWT.create().withAudience(dto.getUsername())
                .sign(Algorithm.HMAC256(dto.getPassword()));
    }
}
