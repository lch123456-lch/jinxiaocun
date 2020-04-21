package com.springboot.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 库存数量
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tnum {

    private int id;
    private int toolId;  //物料id
    private int number; //数量

}
