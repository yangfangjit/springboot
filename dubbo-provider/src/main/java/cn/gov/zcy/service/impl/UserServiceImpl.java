/*
 * Cai.xin Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */

package cn.gov.zcy.service.impl;

import cn.gov.zcy.UserService;
import cn.gov.zcy.entity.User;

/**
 * user service
 *
 * @author 幽明
 * @version 1.0.0
 * @serial 2018/2/11
 */
public class UserServiceImpl implements UserService {
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}

