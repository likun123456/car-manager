package com.bruce.carmanager.convertor.vo;

import com.bruce.carmanager.convertor.IVoConvertor;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.vo.LoginUserVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 15:50
 */
@Mapper(componentModel = "spring")
public abstract class LoginUserVoConvertor implements IVoConvertor<LoginUserVO, UserEntity> {

}
