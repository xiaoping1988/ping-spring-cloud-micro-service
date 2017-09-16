package com.ping.service;

import com.ping.service.c.ServiceCClient;
import com.ping.service.c.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujiangping on 2017/9/16.
 */
@Api(description = "服务A的api")
@RestController
@RequestMapping("/api/a")
public class AController {

    @Autowired
    private ServiceCClient serviceCClient;

    @ApiOperation(value = "查询一个用户")
    @GetMapping("/{user_id:^\\d+$}")
    public User getByUserId(@ApiParam(value = "用户ID", required = true) @PathVariable Long user_id) {
        return this.serviceCClient.getByUserId(user_id);
    }
}
