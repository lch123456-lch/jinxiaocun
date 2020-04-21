package com.springboot.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Tbuy;
import com.springboot.demo.bean.Tnum;
import com.springboot.demo.bean.Ttool;
import com.springboot.demo.dao.TbuyMapper;
import com.springboot.demo.dao.TnumMapper;
import com.springboot.demo.dao.TtoolMapper;
import com.springboot.demo.vo.TbuyCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbuyService {

    @Resource
    private TbuyMapper tbuyMapper;
    @Resource
    private TnumMapper tnumMapper;
    @Resource
    private TtoolMapper ttoolMapper;

    /**
     * 查询采购数据 并进行分页显示
     * @param start
     * @param size
     * @return
     */
    public PageInfo<TbuyCode> selectAll(int start ,int size ){
        PageHelper.startPage(start,size,"id desc");  //支持分页,并按照降序排列
        List<TbuyCode> tbuys = tbuyMapper.selectAll();  //查询采购单数据
        PageInfo<TbuyCode> pages = new PageInfo<>(tbuys,5); //获取分页信息,并在导航栏显示5个数字
        return  pages;
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    public int delete(int id){
        int i = tbuyMapper.delete(id);
        return i;
    }

    /**
     * 点击入库操作
     * @return
     */
    public int  instorage(int id){
        //首先先修改采购单状态
        tbuyMapper.uptateState(id);
        //获取采购表中数据
        Tbuy tbuy = tbuyMapper.get(id);
        //创建Tnum对象
        Tnum tnum = new Tnum(); //库存
        tnum.setToolId(tbuy.getToolId());
        tnum.setNumber(tbuy.getBuyNum());
        //先查询库存中是否具有此物料
        Tnum tnum1 = tnumMapper.select(tnum.getToolId());
        int count = 0;
        //若有 修改语句
        if(tnum1!=null){
            tnum1.setNumber(tnum.getNumber()+tnum1.getNumber());
            count = tnumMapper.update(tnum1);
        }else{
            //若没有 插入语句
            count = tnumMapper.insert(tnum);
        }
        return count;
    }

    /**
     * 新增采购单
     * @param tbuy
     * @return
     */
    public int add(Tbuy tbuy){
        return tbuyMapper.add(tbuy);
    }

    /**
     * 获取所有采购物料和id
     * @return
     */
    public List<Ttool> getwuliaoIdAndName(){
        List<Ttool> ttools = ttoolMapper.listIdAndName();
        return ttools;
    }

}
