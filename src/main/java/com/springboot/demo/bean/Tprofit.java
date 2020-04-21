package com.springboot.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 利润
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tprofit {

    private int id;
    private int toolId;  //物料id
    private int profit; //利润
    private int saleId; //销售id

}
