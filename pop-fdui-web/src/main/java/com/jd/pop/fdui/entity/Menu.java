package com.jd.pop.fdui.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
/***
 * 2017/10/18 14:01
 */
@ApiModel(value = "Menu", description = "Menu desc")
public class Menu {

    @ApiModelProperty(value = "编号")
    private String label;
    @ApiModelProperty(value = "名称")
    private String text;
    @ApiModelProperty(value = "子元素")
    private List<Menu> childrens;

    public Menu(String label, String text) {
        this.label = label;
        this.text = text;
    }

    public void addChildren(Menu menu){
        if (childrens==null){
            childrens=new ArrayList();
        }
        childrens.add(menu);
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Menu> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Menu> childrens) {
        this.childrens = childrens;
    }
}
