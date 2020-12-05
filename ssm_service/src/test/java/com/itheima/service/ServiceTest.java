package com.itheima.service;

import com.itheima.bean.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class ServiceTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemServie =(ItemsService)ac.getBean("itemsServiceimpl");
        Items item = new Items();
        item.setName("华为手机");
        item.setPrice(9999f);
        item.setCreatetime(new Date());
        item.setPic("1.jpg");
        itemServie.save(item);



        List<Items> list = itemServie.findAll();
        for (Items im : list) {
            System.out.println(im);
        }

    }
}

