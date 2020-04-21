package com.springboot.demo.dao;
import com.springboot.demo.bean.Ttool;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TtoolMapper {
    //获取采购物料信息
    public List<Ttool> listIdAndName();
    //获取销售组件信息
    public List<Ttool> listIdAndName2();
    //根据id获取信息
    public int get(@Param("id") int id);
    //插入ttool对象
    public int insertTool(Ttool ttool);
    //根据名称获取id
    public int selectIdByName(@Param("name") String name);
}
