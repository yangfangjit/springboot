/*
 * Cai.xin Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */

package cn.gov.zcy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * //TODO 类描述
 *
 * @author 幽明
 * @version 1.0.0
 * @serial 2018/2/11
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -4844390143196939946L;

    private int id;
    private String name;
    private int age;
    private String address;
}
