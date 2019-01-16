package cn.bt.service.impl;

import cn.bt.dao.AccountDao;
import cn.bt.factory.BeanFactory;
import cn.bt.service.AccountService;

public class AccountServiceImpl implements AccountService {
    //private AccountDao aDao = new AccountDaoImpl();
    private AccountDao aDao = (AccountDao)BeanFactory.getBean("accountDao");



    public void saveAccount() {
        aDao.saveAccount();
    }
}
