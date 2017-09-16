package com.ping.service.c;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by liujiangping on 2017/9/16.
 */
@FeignClient("service-c")
public interface ServiceCClient {

    /**
     * 根据用户ID查询用户
     * @param user_id
     * @return
     */
    @RequestMapping(
            value = {"/api/user/one"},
            method = {RequestMethod.GET},
            consumes = {"application/json"}
    )
    User getByUserId(@RequestParam("user_id") Long user_id);

    /**
     * 根据用户名查询
     * @param user_name
     * @return
     */
    @RequestMapping(
            value = {"/api/user/all"},
            method = {RequestMethod.GET},
            consumes = {"application/json"}
    )
    List<User> listByUsername(@RequestParam("user_name") String user_name);
}
