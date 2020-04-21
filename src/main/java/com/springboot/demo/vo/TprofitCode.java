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
public class TprofitCode {

    private int id;
    private int toolId; //物料id
    private int profit;  //销售利润
    private String code; //物料编号
    private String name; //物料名称
    private String danwei; //单位
    private int buyPrice;  //物料单价
    private int salePrice;  //销售单价
    private int saleNum;  //销售数量

}
