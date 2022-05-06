package com.bruce.carmanager.common.utils;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 11:36
 */
@Slf4j
@Component
public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Long nextId(Object entity) {
        return IdGenerator.generateId();
    }
}
