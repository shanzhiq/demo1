package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.dao.IndexMapper;
import com.example.demo1.entity.wd_carousel;
import com.example.demo1.entity.wd_system_msg;
import com.example.demo1.entity.wd_product;
import com.example.demo1.entity.wd_category;

@RestController
@RequestMapping("/index")

public class IndexController {
    @Autowired
    IndexMapper indexMapper;

    @RequestMapping(value={"/getCarouselData"}, method=RequestMethod.GET)
    public List<wd_carousel> getCarouselData(){
        return indexMapper.getCarouselData();
    }

    @RequestMapping(value={"/getSystemMsgData"}, method=RequestMethod.GET)
    public List<wd_system_msg> getSystemMsgData(){
        return indexMapper.getSystemMsgData();
    }

    @RequestMapping(value={"/getTopData"}, method=RequestMethod.GET)
    public List<wd_product> getTopData(){
        return indexMapper.getTopData();
    }

    @RequestMapping(value={"/getCateData"}, method=RequestMethod.GET)
    public List<wd_category> getCateData(){
        return indexMapper.getCateData();
    }

    @RequestMapping(value={"/getProductData"}, method=RequestMethod.GET)
    public List<wd_product> getProductData(String page, String page_size){
        int p = Integer.parseInt(page);
        int ps = Integer.parseInt(page_size);
        int start = p * ps;
        return indexMapper.getProductData(start, ps);
    }

    @RequestMapping(value={"/getCateProductData"}, method=RequestMethod.GET)
    public List<wd_product> getCateProductData(String cate_id, String page, String page_size){
        int c = Integer.parseInt(cate_id);
        int p = Integer.parseInt(page);
        int ps = Integer.parseInt(page_size);
        int start = p * ps;
        return indexMapper.getCateProductData(c, start, ps);
    }
}
