package com.msb.controller;

import com.msb.pojo.Person;
import com.msb.pojo.Pet;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/30 - 06 - 30 - 14:19}
 * @Description:
 * @version:1.0
 */
@RestController
public class ReceiveDataController {
    @RequestMapping("/dateByReceive")
    public String dateByReceive(Person person){
        System.out.println(person.getPets());
        System.out.println(person);
        System.out.println(person.getPetMap());
        return "success";

    }
   /* @RequestMapping("/dateByReceive1")
    public String dateByReceive1(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthdate){

        System.out.println(birthdate);
        return "success";

    }*/
}
