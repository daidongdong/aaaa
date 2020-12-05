package com.itheima.test;

import com.itheima.bean.Items;
import com.itheima.dao.ItemsDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class DaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        ItemsDao itemsDao = (ItemsDao) classPathXmlApplicationContext.getBean("itemsDao");

        System.out.println("商品列表：：："+itemsDao.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
