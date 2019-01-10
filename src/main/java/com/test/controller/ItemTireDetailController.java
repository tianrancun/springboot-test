//package com.test.controller;
//
//import com.test.dao.elasticsearch.ItemTireDetailRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/tire")
//public class ItemTireDetailController {
//
//    @Autowired
//    private ItemTireDetailRepository itemTireDetailRepository;
//
//    @GetMapping("/getAll")
//    public void getAllTire(){
//        System.out.println("start find all tire");
//       List list =  itemTireDetailRepository.findAll();
//        System.out.println(list.size());
//    }
//}