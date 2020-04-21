package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Tbuy;
import com.springboot.demo.bean.Ttool;
import com.springboot.demo.service.TbuyService;
import com.springboot.demo.vo.TbuyCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tbuy")
public class TbuyController {

    @Resource
    private TbuyService tbuyService;

    /**
     * 分页查询采购单信息
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/selectAllTbuy")
    public PageInfo<TbuyCode> selectAllTbuy(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                            @RequestParam(value = "size" , defaultValue = "8") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  tbuyService.selectAll(start,size);
    }
    /*
    * 删除采购单
    * */
    @RequestMapping("/delete")
    public String delete(int id){
        int i = tbuyService.delete(id);
        if(i>0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    /**
     * 入库操作
     * @return
     */
    @RequestMapping("/instorge")
    public String instorge(int id){
        int i = tbuyService.instorage(id);
        if (i>0){
            return "入库成功";
        }else{
            return "入库失败";
        }
    }

    /**
     * 新增采购单
     * @return
     */
    @RequestMapping("/add")
    public String add(@RequestBody Tbuy tbuy){
        int i = tbuyService.add(tbuy);
        if(i>0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }

    /**
     * 获取所有采购的（物料id和name）
     * @return
     */
    @RequestMapping("/getwuliao")
    public List<Ttool> getwuliaoIdAndName(){
        return tbuyService.getwuliaoIdAndName();
    }


}
