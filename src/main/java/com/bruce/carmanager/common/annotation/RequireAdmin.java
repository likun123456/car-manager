package com.bruce.carmanager.common.annotation;

import com.bruce.carmanager.common.enums.RoleEnum;

import java.lang.annotation.*;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:10
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequireAdmin {
}
