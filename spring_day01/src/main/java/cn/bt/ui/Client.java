package cn.bt.ui;

import cn.bt.factory.BeanFactory;
import cn.bt.service.AccountService;

public class Client {

    public static void main(String[] args) {
        AccountService as = (AccountService) BeanFactory.getBean("accountService");

        as.saveAccount();
    }
}
