package com.springboot.demo.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.demo.service.TboomService;
import com.springboot.demo.vo.TboomCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tboom")
public class TboomController {

    @Resource
    private TboomService tboomService;

    /**
     * 分页查询物料库存单信息
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/selectAllTboom")
    public PageInfo<TboomCode> selectAllTboom(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                            @RequestParam(value = "size" , defaultValue = "8") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  tboomService.selectAll(start,size);
    }

   

}
