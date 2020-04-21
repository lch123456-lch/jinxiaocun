package com.springboot.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 物料bean对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ttool {

    private int id;
    private String code; //编号
    private String name; //名称
    private String unitbase; //最小单位
    private int unitprice; //单价
    private String itemtype; //类型


}
