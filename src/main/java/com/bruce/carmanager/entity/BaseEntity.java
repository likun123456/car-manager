package com.bruce.carmanager.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 07
 **/
public class BaseEntity {

    @TableId(type = IdType.ID_WORKER)
    private Integer id;
}
