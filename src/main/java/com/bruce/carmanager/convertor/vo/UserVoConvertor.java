package com.bruce.carmanager.convertor.vo;

import com.bruce.carmanager.convertor.IVoConvertor;
import com.bruce.carmanager.entity.UserEntity;
import com.bruce.carmanager.vo.UserVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 9:40
 */
@Mapper(componentModel = "spring")
public abstract class UserVoConvertor implements IVoConvertor<UserVO, UserEntity> {
}
