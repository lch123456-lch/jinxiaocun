package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.dao.TboomMapper;
import com.springboot.demo.vo.TboomCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TboomService {

    @Resource
    private TboomMapper tboomMapper;
    /**
     * 查询包装清单数据 并进行分页显示
     * @param start
     * @param size
     * @return
     */
    public PageInfo<TboomCode> selectAll(int start ,int size ){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<TboomCode> tbooms = tboomMapper.selectAll();  //查询物料库存数据
        PageInfo<TboomCode> pages = new PageInfo<>(tbooms,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }


}
