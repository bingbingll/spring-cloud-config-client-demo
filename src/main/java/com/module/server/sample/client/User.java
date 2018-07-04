package com.module.server.sample.client;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TODO description：user model
 *
 * @author bing.li
 * @version v1.0
 * @date 2018/7/4 18:02
 */
@Getter
@Setter
@Entity
@Table(name = "test_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String addr;
    private String name;
    private String sex;
}
