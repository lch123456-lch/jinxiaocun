package com.springboot.demo.dao;

import com.springboot.demo.bean.Tsale;
import com.springboot.demo.vo.TsaleCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 销售订单 增删改查
 */
@Mapper
public interface TsaleMapper {

    public int add(Tsale tsale);
    //删除
    public int delete(@Param("id") int id);
    //更新
    public int update(Tsale tsale);
    //获取信息
    public List<TsaleCode> selectAll();
    //根据id获取信息
    public Tsale get(@Param("id") int id);
    //更新出库状态
    public int uptateState(@Param("id") int id);

}
