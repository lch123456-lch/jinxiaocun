package com.springboot.demo.service;
import com.springboot.demo.bean.*;
import com.springboot.demo.bean.Tsale;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.dao.TnumMapper;
import com.springboot.demo.dao.TprofitMapper;
import com.springboot.demo.dao.TsaleMapper;
import com.springboot.demo.dao.TtoolMapper;
import com.springboot.demo.vo.TsaleCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TsaleService {

    @Resource
    private TsaleMapper tsaleMapper;
    @Resource
    private TnumMapper tnumMapper;
    @Resource
    private TtoolMapper ttoolMapper;
    @Resource
    private TprofitMapper tprofitMapper;
    /**
     * 查询销售数据 并进行分页显示
     * @param start
     * @param size
     * @return
     */
    public PageInfo<TsaleCode> selectAll(int start ,int size ){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<TsaleCode> tsales = tsaleMapper.selectAll();  //查询销售单数据
        PageInfo<TsaleCode> pages = new PageInfo<>(tsales,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }
    /**
     * 删除数据
     * @param id
     * @return
     */
    public int delete(int id){
        int i = tsaleMapper.delete(id);
        return i;
    }
    /**
     * 点击出库操作
     * @return
     */
    public int  outstorage(int id){
        //首先先修改销售单状态
        tsaleMapper.uptateState(id);
        //获取销售表中数据
        Tsale tsale = tsaleMapper.get(id);
        //创建Tnum对象
        Tnum tnum = new Tnum(); //库存
        tnum.setToolId(tsale.getToolId());
        tnum.setNumber(tsale.getSaleNum());
        //先查询库存中是否具有此物料
        Tnum tnum1 = tnumMapper.select(tnum.getToolId());
        int count = 0;
        //若有 修改语句
        if(tnum1!=null){
            tnum1.setNumber(tnum1.getNumber()-tnum.getNumber());
            count = tnumMapper.update(tnum1);
        }
        int toolId=tsale.getToolId();
        int buyPrice = ttoolMapper.get(id);
        Tprofit tprofit = new Tprofit();
        tprofit.setToolId(tsale.getToolId());
        tprofit.setSaleId(id);
        tprofit.setProfit(tsale.getSalePrice()*tsale.getSaleNum()-buyPrice*tsale.getSaleNum());
        tprofitMapper.insert(tprofit);
        return count;
    }


    /**
     * 新增销售单
     * @param tsale
     * @return
     */
    public int add(Tsale tsale){
        return tsaleMapper.add(tsale);
    }

    /**
     * 获取所有销售组件名称和id
     * @return
     */
    public List<Ttool> getxiaoshouIdAndName(){
        List<Ttool> ttools = ttoolMapper.listIdAndName2();
        return ttools;
    }

}
