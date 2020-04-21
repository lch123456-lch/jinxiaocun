package com.springboot.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 物料
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class TnumCode {

    private int id;
    private int toolId; //物料id
    private int num;  //物料库存
    private String code; //物料编号
    private String name; //物料名称
    private String danwei; //单位
    private int price;  //物料单价
    private String type; //类型

}
