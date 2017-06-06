package com.jql.springcache.demo;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author yifan
 * @since 2017/6/5 20:01
 */
@Service
public class AccountServiceImpl implements AccountService {

    private ConcurrentHashMap<Integer, Account> map = new ConcurrentHashMap<>();

    public boolean addAccount(Account account) {
        System.out.println(MehotdUtils.getMehod());
        if (map.get(account.getId()) != null) {
            throw new IllegalArgumentException("Account is already exist.");
        }
        return map.put(account.getId(), account) != null;
    }

    @CacheEvict(value = "Account", key = "#account.id")
    public boolean updateAccount(Account account) {
        System.out.println(MehotdUtils.getMehod());
        if (map.get(account.getId()) == null) {
            throw new IllegalArgumentException("Account is not exist.");
        }
        return map.put(account.getId(), account) != null;
    }

    @Cacheable(value = "Account", key = "#id")
    public Account getAccount(int id) {
        System.out.println(MehotdUtils.getMehod());
        return map.get(id);
    }
}
