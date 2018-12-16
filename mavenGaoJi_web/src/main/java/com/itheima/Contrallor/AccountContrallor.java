package com.itheima.Contrallor;

import com.itheima.domain.Items;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/items")
public class AccountContrallor {
    @Autowired
    private AccountService accountService;

    //跳转添加
    @RequestMapping("/jumpInsert")
    public String jumpInsert() {
       return "itemsAdd";
    }

    //添加一条
    @RequestMapping("/insertOne")
    public void insertOne(Items items, HttpServletResponse response,HttpServletRequest request) throws Exception {
        accountService.insertOne(items);
        String path = request.getContextPath();
        response.sendRedirect(path+"/items/findAll");
    }

    //查询所有
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        List<Items> list=accountService.findAll();
        for (Items items : list) {
            System.out.println(items);
        }
        mv.addObject("list",list);
        mv.setViewName("itemsList");
        return mv;
    }

    //删除单个
    @RequestMapping("/deleteOneById")
    public void deleteOneById(Integer id, HttpServletResponse response,HttpServletRequest request) throws Exception {
        accountService.deleteOneById(id);
        String path = request.getContextPath();
        response.sendRedirect(path+"/items/findAll");
    }

    //修改单个商品
    @RequestMapping("/updateOne")
    public void updateOne(Items items, HttpServletResponse response,HttpServletRequest request) throws Exception {
        System.out.println(items);
        accountService.updateOne(items);
        String path = request.getContextPath();
        response.sendRedirect(path+"/items/findAll");
    }

    //跳转修改页面
    @RequestMapping("/jumpUpdate")
    public ModelAndView jumpUpdate(int id, HttpServletResponse response,HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        Items items=accountService.jumpUpdate(id);
        mv.addObject("items",items);
        mv.setViewName("itemsUpdate");
        return mv;
    }
}
