package com.springboot.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
*销售
* */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tsale {
    private int id;   //id
    private int toolId; //物料id
    private int saleId; //销售id
    private int status; //状态  0未出库 1出库
    private int saleNum; //销售数量
    private int salePrice; //销售单价
}
