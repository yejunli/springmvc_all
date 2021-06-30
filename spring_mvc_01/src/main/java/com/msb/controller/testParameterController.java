package com.msb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/30 - 06 - 30 - 11:16}
 * @Description:
 * @version:1.0
 */
@RestController
public class testParameterController {
    @RequestMapping("/getParameter.do")
    public String getParameter(String username,String password){
        System.out.println("username"+username+"    password"+password);
        return "success";
    }
}
