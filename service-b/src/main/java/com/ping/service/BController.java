package com.ping.service;

import com.ping.service.c.ServiceCClient;
import com.ping.service.c.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liujiangping on 2017/9/16.
 */
@Api(description = "服务B的api")
@RestController
@RequestMapping("/api/b")
public class BController {

    @Autowired
    private ServiceCClient serviceCClient;

    @ApiOperation(value = "查询一个用户")
    @GetMapping("/list")
    public List<User> listByUsername(@ApiParam(value = "用户姓名", required = true) String user_name) {
        return this.serviceCClient.listByUsername(user_name);
    }
}
