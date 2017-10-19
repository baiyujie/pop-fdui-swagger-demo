package com.jd.pop.fdui.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by White on 2017/10/18.
 */
@ApiModel(value = "RestEetity", description = "RestEetity desc")
public class RestEetity {

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("返回对象")
    private ReqEntity reqEntity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ReqEntity getReqEntity() {
        return reqEntity;
    }

    public void setReqEntity(ReqEntity reqEntity) {
        this.reqEntity = reqEntity;
    }
}
