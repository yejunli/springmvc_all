package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: YeZhanCHN
 * @Date: 2021/6/30 - 06 - 30 - 17:17}
 * @Description: 宠物类
 * @version:1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet implements Serializable {
    private String petName;
    private String petType;
}
