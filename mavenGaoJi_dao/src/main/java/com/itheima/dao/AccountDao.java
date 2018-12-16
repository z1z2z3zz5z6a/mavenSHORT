package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface AccountDao {
        //查询所有
    @Select("select * from items")
    List<Items> findAll();

    //添加一个账户
    @Insert("insert into items values(#{id},#{name},#{price},#{detail})")
    void insertOne(Items items);

    //删除一个账户
    @Delete("delete from items where id=#{id}")
    void deleteOneById(int id);

    //修改一个账户
    @Update("update items set name=#{name},price=#{price},detail=#{detail} where id=#{id}")
    void updateOne(Items items);

    @Select("select * from items where id=#{id}")
    Items jumpUpdate(int id);
}
