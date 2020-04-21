package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.service.TprofitService;
import com.springboot.demo.vo.TprofitCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tprofit")
public class TprofitController {

    @Resource
    private TprofitService tprofitService;

    /**
     * 分页查询利润信息
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/selectAllTprofit")
    public PageInfo<TprofitCode> selectAllTprofit(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                            @RequestParam(value = "size" , defaultValue = "8") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  tprofitService.selectAll(start,size);
    }

   

}
