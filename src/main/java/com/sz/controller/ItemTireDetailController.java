package com.sz.controller;

import com.sz.dao.ItemTireDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author vn0ow6b
 * @Title: ItemTireDetailController
 * @Description: TODO
 * @date 2019/1/4 16:06
 */
@RestController
@RequestMapping("/tire")
public class ItemTireDetailController {

    @Autowired
    private ItemTireDetailRepository itemTireDetailRepository;

    @GetMapping("/getAll")
    public void getAllTire(){
        System.out.println("start find all tire");
       List list =  itemTireDetailRepository.findAll();
        System.out.println(list.size());
    }
}