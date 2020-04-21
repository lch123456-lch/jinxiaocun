package com.springboot.demo.dao;

import com.springboot.demo.bean.Tboom;
import com.springboot.demo.vo.TboomCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 包装清单持久层
 */
@Mapper
public interface TboomMapper {
    //获取包装清单信息
    public List<TboomCode> selectAll();

}
