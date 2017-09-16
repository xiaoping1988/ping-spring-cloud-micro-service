package com.ping.service.c;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 用户
 * Created by liujiangping on 2017/8/20.
 */
@ApiModel("用户信息")
public class User{

    @ApiModelProperty("用户id")
    private Long user_id;

    @ApiModelProperty("用户姓名")
    private String user_name;

    @ApiModelProperty("用户账号")
    private String user_account;

    @ApiModelProperty("用户年龄")
    private Integer user_age;

    @ApiModelProperty("用户所在城市")
    private String user_city;

    @ApiModelProperty("创建时间")
    protected Date create_time;

    @ApiModelProperty("修改时间")
    protected Date update_time;

    public User() {}

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
