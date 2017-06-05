package com.jql.springcache.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yifan
 * @since 2017/6/5 20:26
 */
public class CacheBaseTest {

    @Test
    public void 测试缓存() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ctx.getBean(AccountService.class);
        Account account = new Account();
        account.setId(1);
        account.setName("yifan");
        account.setPassword("fanyi");
        accountService.addAccount(account);
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "##" + accountService.getAccount(account.getId()));
        }
        account.setName("hades");
        account.setPassword("bai");
        accountService.updateAccount(account);
        for (int i = 3; i < 6; i++) {
            System.out.println(i + "##" + accountService.getAccount(account.getId()));
        }
        for (int i = 6; i < 9; i++) {
            System.out.println(i + "##" + accountService.getAccount(i));
        }
    }
}
