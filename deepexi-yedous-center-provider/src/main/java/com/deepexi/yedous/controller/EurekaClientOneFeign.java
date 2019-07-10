package com.deepexi.yedous.controller;

/**
 * Created by sihouzi08 on 2019/7/9.
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  value为deepexi-yedou-center注册时的 spring.application.name -- path前缀
 */
@FeignClient(value = "deepexi-yedou-center",path ="/api/v1/users")
public interface EurekaClientOneFeign {
    /**
     * deepexi-yedou-center的user访问接口
     */
    @RequestMapping("/list")
    Object home();
}

