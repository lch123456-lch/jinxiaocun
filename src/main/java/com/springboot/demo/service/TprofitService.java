package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.dao.TprofitMapper;
import com.springboot.demo.vo.TprofitCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TprofitService {

    @Resource
    private TprofitMapper tprofitMapper;
    /**
     * 查询利润 并进行分页显示
     * @param start
     * @param size
     * @return
     */
    public PageInfo<TprofitCode> selectAll(int start ,int size ){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<TprofitCode> tprofits = tprofitMapper.selectAll();  //查询物料库存数据
        PageInfo<TprofitCode> pages = new PageInfo<>(tprofits,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }


}
