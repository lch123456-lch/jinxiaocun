package com.springboot.demo.dao;

import com.springboot.demo.bean.Tbuy;
import com.springboot.demo.vo.TbuyCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 采购订单 增删改查
 */
@Mapper
public interface TbuyMapper {
    //获取所有采购单信息
    public List<TbuyCode> selectAll();
    //增加采购单
    public int add(Tbuy tbuy);
    //根据id删除
    public int delete(@Param("id") int id);
    //更新
    public int update(Tbuy tbuy);
    //更新入库状态
    public int uptateState(@Param("id") int id);
    //根据id获取信息
    public Tbuy get(@Param("id") int id);


}
