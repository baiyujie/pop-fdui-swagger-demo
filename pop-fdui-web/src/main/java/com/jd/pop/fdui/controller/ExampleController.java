package com.jd.pop.fdui.controller;

import com.jd.pop.fdui.entity.ReqEntity;
import com.jd.pop.fdui.entity.RestMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by White on 2017/10/18.
 */
@Api(value = "example",tags = "example")
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @PostMapping("/examp1")
    @ApiOperation(value = "ModelAttribute",notes = "ModelAttribute类型参数")
    public RestMessage reqbody1(ReqEntity reqEntity){
        return new RestMessage(reqEntity);
    }
}
