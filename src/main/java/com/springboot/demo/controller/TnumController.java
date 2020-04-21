package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.service.TnumService;
import com.springboot.demo.vo.TnumCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tnum")
public class TnumController {

    @Resource
    private TnumService tnumService;

    /**
     * 分页查询物料库存单信息
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/selectAllTnum")
    public PageInfo<TnumCode> selectAllTnum(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                            @RequestParam(value = "size" , defaultValue = "8") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  tnumService.selectAll(start,size);
    }

   

}
