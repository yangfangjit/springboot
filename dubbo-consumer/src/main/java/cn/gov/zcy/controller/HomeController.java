/*
 * Cai.xin Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */

package cn.gov.zcy.controller;

import cn.gov.zcy.UserService;
import cn.gov.zcy.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 类描述
 *
 * @author 幽明
 * @version 1.0.0
 * @serial 2018/2/11
 */
@RestController
@Slf4j
public class HomeController {

    private UserService userService;

    @RequestMapping("/")
    public
    @ResponseBody
    User home(){
        User user = new User();
        user.setId(1);
        user.setName("youming");
        user.setAddress("之江家园");
        user.setAge(27);
        log.info(user.toString());
        return  user;
    }


}
