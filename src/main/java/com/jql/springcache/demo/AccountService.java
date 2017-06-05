package com.jql.springcache.demo;

/**
 * @author yifan
 * @since 2017/6/5 20:00
 */
public interface AccountService {

    /**
     * 添加一个账户
     *
     * @param account
     * @return
     */
    boolean addAccount(Account account);

    /**
     * 修改一个账户
     *
     * @param account
     * @return
     */
    boolean updateAccount(Account account);

    /**
     * 查找一个账户
     *
     * @param id
     * @return
     */
    Account getAccount(int id);
}
