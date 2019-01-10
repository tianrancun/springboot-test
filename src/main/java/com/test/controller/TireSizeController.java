package com.test.controller;

import com.test.service.TireSizeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class TireSizeController {
	
	@Autowired
	private TireSizeService tireSizeService;


    @RequestMapping("/findByTireSize/{width}")
    public String getTireSizeByWidth(@PathVariable String width) {

        String list = tireSizeService.findByTireWidth("235");
        log.info("/findByTireSize/{width}  " + width);
        return "hello " + width + ": " + list;
    }
}
