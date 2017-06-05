package com.jql.springcache.demo;

import java.io.Serializable;

/**
 * @author yifan
 * @since 2017/6/5 19:59
 */
public class Account implements Serializable {

    private static final long serialVersionUID = 1302970055658451445L;

    private int id;

    private String name;

    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public Account setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Account setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }
}
