package com.springboot.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class TsaleCode {

    private int id;
    private int toolId; //物料id
    private String name; //物料名称
    private int status; //状态
    private int salePrice; //销售单价
    private int saleNum; //销售数量

}
