package com.springboot.demo.controller;
import com.springboot.demo.bean.Tsale;
import com.github.pagehelper.PageInfo;
import com.springboot.demo.bean.Ttool;
import com.springboot.demo.service.TsaleService;
import com.springboot.demo.vo.TsaleCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tsale")
public class TsaleController {

    @Resource
    private TsaleService tsaleService;

    /**
     * 分页查询销售单信息
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/selectAllTsale")
    public PageInfo<TsaleCode> selectAllTsale(@RequestParam(value = "start" , defaultValue = "1") Integer start ,
                                            @RequestParam(value = "size" , defaultValue = "8") Integer size){
        if(start == null || start < 1){
            start = 1;
        }
        return  tsaleService.selectAll(start,size);
    }
    /**
     *删除
     *
    */
    @RequestMapping("/delete")
    public String delete(int id){
        int i = tsaleService.delete(id);
        if(i>0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    /**
     * 出库操作
     * @return
     */
    @RequestMapping("/outstorge")
    public String outstorge(int id){
        int i = tsaleService.outstorage(id);
        if (i>0){
            return "出库成功";
        }else{
            return "出库失败,么有销售组件";
        }
    }

    /**
     * 新增销售单
     * @return
     */
    @RequestMapping("/add")
    public String add(@RequestBody Tsale tsale){
        int i = tsaleService.add(tsale);
        if(i>0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }

    /**
     * 获取所有销售组件id和name
     * @return
     */
    @RequestMapping("/getxiaoshou")
    public List<Ttool> getxiaoshouIdAndName(){
        return tsaleService.getxiaoshouIdAndName();
    }

}
