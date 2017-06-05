package com.jql.springcache.demo;

/**
 * @author yifan
 * @since 2017/6/5 20:20
 */
public class MehotdUtils {

    public static String getMehod() {
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        return stacks[2].getClassName() + "#" + stacks[2].getMethodName();
    }
}
