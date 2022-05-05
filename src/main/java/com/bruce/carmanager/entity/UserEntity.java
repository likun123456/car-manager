package com.bruce.carmanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 06
 **/
@Data
@TableName("user")
@ToString
public class UserEntity extends BaseEntity {

    private String username;

    private String password;

    private String nickname;

    private Integer gender;

    private Integer age;

}
