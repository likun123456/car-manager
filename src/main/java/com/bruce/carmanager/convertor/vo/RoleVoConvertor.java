package com.bruce.carmanager.convertor.vo;

import com.bruce.carmanager.convertor.IDtoConvertor;
import com.bruce.carmanager.convertor.IVoConvertor;
import com.bruce.carmanager.entity.RoleEntity;
import com.bruce.carmanager.vo.RoleVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 16:05
 */
@Mapper(componentModel = "spring")
public abstract class RoleVoConvertor implements IVoConvertor<RoleVO, RoleEntity> {
}
