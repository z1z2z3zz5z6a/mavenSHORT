package com.itheima.service.Impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Items;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Items> findAll() {
        return accountDao.findAll();
    }

    public void insertOne(Items items) {
        accountDao.insertOne(items);
    }

    public void deleteOneById(int id) {
        accountDao.deleteOneById(id);
    }

    public void updateOne(Items items) {
        accountDao.updateOne(items);
    }

    public Items jumpUpdate(int id) {
        return accountDao.jumpUpdate(id);
    }

    public void test1(){
        System.out.println("haha");
    }
}
