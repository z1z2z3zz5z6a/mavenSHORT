package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

public interface AccountService {
    //查询所有
    List<Items> findAll();

    //添加一个账户
    void insertOne(Items items);
    //删除一个账户
    void deleteOneById(int id);
    //修改一个账户
    void updateOne(Items items);

    //修改单个账户
    Items jumpUpdate(int id);
}
