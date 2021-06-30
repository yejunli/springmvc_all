package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/29 - 06 - 29 - 13:30}
 * @Description:
 * @version:1.0
 */
@Controller
@RequestMapping("/msb")
public class MyController {
    @RequestMapping("controllerFirst/{id}/{username}")
    public String controllerFirst1(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("this is controllerFirst mathod");
        return "first";
    }
}
