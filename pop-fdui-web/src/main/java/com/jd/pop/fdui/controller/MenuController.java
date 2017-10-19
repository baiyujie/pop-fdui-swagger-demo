package com.jd.pop.fdui.controller;

import com.jd.pop.fdui.entity.Menu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by White on 2017/10/18.
 */
@Api(value = "菜单",tags = "菜单")
@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @PostMapping("/getMenu")
    @ApiOperation(value = "获取菜单",notes = "获取菜单,考虑递归的情况")
    public Menu getMenu(){
        Menu menu=new Menu("caidan_system","菜单系统");

        menu.addChildren(new Menu("label1","菜单1"));
        menu.addChildren(new Menu("label2","菜单2"));
        menu.addChildren(new Menu("label3","菜单3"));
        menu.addChildren(new Menu("label4","菜单4"));
        return menu;
    }
}
