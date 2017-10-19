package com.jd.pop.fdui.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by White on 2017/10/16.
 */
@ApiModel(value = "User", description = "用户对象")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="编号",name="id", dataType = "java.lang.Long", example = "1", reference = "123")
    private Long id;
    @ApiModelProperty(value="密码",name="password", dataType = "String", example = "ceshiname", reference = "123")
    private String password;
    @ApiModelProperty(value="用户名",name="username", dataType = "String", example = "123", reference = "123")
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
