package com.springboot.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
* 采购
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tbuy {
    private int id;   //id
    private int toolId; //物料id
    private int status; //状态  0未加入 1加入
    private int buyNum; //采购数量


}
