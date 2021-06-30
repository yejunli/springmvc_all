package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/29 - 06 - 29 - 13:30}
 * @Description:
 * @version:1.0
 */
@Controller
//@RequestMapping("/msb")
public class MyController1 {
    @RequestMapping("controllerFirst2.do")
    public String controllerFirst1(){
        System.out.println("this is Controller1");
        return "/WEB-INF/success.jsp";
    }
}
