package com.jd.pop.fdui.entity;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * Created by White on 2017/10/18.
 */
@ApiModel(value="RestMessage", description="RestMessage desc")
public class RestMessage<T> implements Serializable{
    private static final long serialVersionUID = 1L;
    private boolean success=true;
    private T data;
    @ApiParam(name="errorCode", value="aaa")
    private Integer errCode;
    @ApiModelProperty(value="message",notes="消息")
    private String message;


    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RestMessage() {
        super();
    }

    public RestMessage(Object data) {
        super();
    }

    public RestMessage(boolean success, Object data) {
        super();
        this.success = success;
    }
}
