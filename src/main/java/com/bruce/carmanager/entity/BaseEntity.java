package com.bruce.carmanager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
}
