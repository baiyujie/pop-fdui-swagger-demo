package com.jd.pop.fdui.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ReqEntity", description = "ReqEntity desc")
public class ReqEntity {
    @ApiModelProperty(value = "姓名",example = "ceshiname")
    private String name;
    @ApiModelProperty(value = "电话号码",example = "555")
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
