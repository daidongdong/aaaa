package com.itheima.service.impl;

import com.itheima.bean.Items;
import com.itheima.dao.ItemsDao;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class itemsServiceimpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemsDao.save(items);
        System.out.println("acount:"+acount);
        return acount;
    }
}