package com.sz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("offer")
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

}