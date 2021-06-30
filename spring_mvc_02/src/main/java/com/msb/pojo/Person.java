package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/30 - 06 - 30 - 16:02}
 * @Description:
 * @version:1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person implements Serializable {
    private String ename;
    private String age;
    private String gender;
    private String[] hobby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;
    //单个宠物
    private Pet pet;
    //宠物集合  List
    private List<Pet> pets;
    //宠物 Map
    private Map<String,Pet> petMap;


}
