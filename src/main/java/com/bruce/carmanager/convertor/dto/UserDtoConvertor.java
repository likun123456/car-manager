package com.bruce.carmanager.convertor.dto;

import com.bruce.carmanager.convertor.IDtoConvertor;
import com.bruce.carmanager.dto.UserDTO;
import com.bruce.carmanager.entity.UserEntity;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 9:33
 */
@Mapper(componentModel = "spring")
public abstract class UserDtoConvertor implements IDtoConvertor<UserDTO, UserEntity> {
}
