package com.msb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
@Controller
//@RequestMapping("/msb")
public class MyController3 {
    @RequestMapping("/firstController3.do")
    public String firstController3(){
        System.out.println("this is firstController");
        return "first";
    }
}