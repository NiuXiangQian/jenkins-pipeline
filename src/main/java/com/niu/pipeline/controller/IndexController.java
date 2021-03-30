package com.niu.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2021/3/30 8:31 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2021/3/30 8:31 上午
 * @updateRemark:
 * @version: 1.0
 **/
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/hello")
    Object hello() {
        return "hello jenkins pipeline";
    }

}
