package com.springboot.demo.dao;

import com.springboot.demo.bean.Tprofit;
import com.springboot.demo.vo.TprofitCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 库存量持久层
 */
@Mapper
public interface TprofitMapper {

    public List<TprofitCode> selectAll();
    //插入
    public int insert(Tprofit tprofit);
    //查询
    public Tprofit select(@Param("toolId") int toolId);
}
