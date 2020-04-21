package com.springboot.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包装清单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tboom {

    private int id;
    private String parentCode;  //父项物料编号
    private String childName; //子项物料名称
    private int num;   //数量
    private String danwei; //单位
}
