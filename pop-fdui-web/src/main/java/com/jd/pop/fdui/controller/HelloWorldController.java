package com.jd.pop.fdui.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by White on 2017/10/18.
 */
@RestController
@RequestMapping("/world")
public class HelloWorldController {

    @ApiOperation(value="你好", notes="Hello World")
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String index() {
        return "Hello World xx";
    }
}