package com.itheima.controller;

import com.itheima.bean.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemsService itemsService;

    /**
     * 保存
     */
    @RequestMapping("/save")
    public String  save(Items items){
        itemsService.save(items);
        return "redirect:/items/findAll";
    }

    /**
     * 查询商品列表
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Items> list = itemsService.findAll();
        model.addAttribute("items",list);
        return "items";
    }
}
