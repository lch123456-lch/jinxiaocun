package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Tnum;
import com.springboot.demo.bean.Tnum;
import com.springboot.demo.bean.Ttool;
import com.springboot.demo.dao.TnumMapper;
import com.springboot.demo.dao.TnumMapper;
import com.springboot.demo.dao.TtoolMapper;
import com.springboot.demo.vo.TnumCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TnumService {

    @Resource
    private TnumMapper tnumMapper;
    /**
     * 查询库存数据 并进行分页显示
     * @param start
     * @param size
     * @return
     */
    public PageInfo<TnumCode> selectAll(int start ,int size ){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<TnumCode> tnums = tnumMapper.selectAll();  //查询物料库存数据
        PageInfo<TnumCode> pages = new PageInfo<>(tnums,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }


}
