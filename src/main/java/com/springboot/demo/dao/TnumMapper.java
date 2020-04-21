package com.springboot.demo.dao;

import com.springboot.demo.bean.Tnum;
import com.springboot.demo.vo.TnumCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 库存量持久层
 */
@Mapper
public interface TnumMapper {

    public List<TnumCode> selectAll();
    //插入
    public int insert(Tnum tnum);
    //修改
    public int update(Tnum tnum);
    //查询
    public Tnum select(@Param("toolId") int toolId);
}
