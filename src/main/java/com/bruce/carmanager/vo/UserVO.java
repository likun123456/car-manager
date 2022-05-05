package com.bruce.carmanager.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 51
 **/
@ApiModel
@Data
public class UserVO implements Serializable {
    @ApiModelProperty("主键Id")
    private Integer id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    private String nickname;

    private Integer gender;

    private Integer age;
}