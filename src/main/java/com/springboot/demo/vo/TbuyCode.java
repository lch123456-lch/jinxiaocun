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
public class TbuyCode {

    private int id;
    private int toolId; //物料id
    private String code; //物料编号
    private String name; //物料名称
    private int status; //是否入库
    private int buyNum; //采购数量
    private String danwei; //单位
    private int buyPrice; //采购单价

}
