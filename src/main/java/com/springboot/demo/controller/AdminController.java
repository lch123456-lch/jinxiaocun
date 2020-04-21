package com.springboot.demo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @RequestMapping("/")
    public String indexs(){
        return "redirect:index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index" ;
    }

    /**
     * 采购单清单集
     * @return
     */
    @RequestMapping("/listtbuy")
    public String listtbuy(){
        return "tbuy/listtbuy";
    }

    /**
     * 添加采购单
     * @return
     */
    @RequestMapping("/addtbuy")
    public String addtbuy(){
         return "tbuy/addtbuy";
    }

    /**
     * 销售单清单集
     * @return
             */
    @RequestMapping("/listtsale")
    public String listtsale(){
        return "tsale/listtsale";
    }

    /**
     * 添加销售单
     * @return
     */
    @RequestMapping("/addtsale")
    public String addtsale(){
        return "tsale/addtsale";
    }

    /**
     * 采购单库存清单集
     * @return
     */
    @RequestMapping("/buystock")
    public String buystock(){
        return "tstock/buystock";
    }

    /**
     * 销售单库存清单集
     * @return
     */
    @RequestMapping("/salestock")
    public String salestock(){
        return "tstock/salestock";
    }

    /**
     * 物料库存清单集
     * @return
     */
    @RequestMapping("/toolstock")
    public String toolstock(){
        return "tstock/toolstock";
    }

    /**
     * 利润清单集
     * @return
     */
    @RequestMapping("/profit")
    public String profit(){
        return "tprofit/profit";
    }

    /**
     * 包装清单集
     * @return
     */
    @RequestMapping("/listboom")
    public String boom(){
        return "tboom/boom";
    }

    /**
     * 物料清单上传
     * @return
     */
    @RequestMapping("/toollist")
    public String toollist(){
        return "ttool/toollist";
    }
}
