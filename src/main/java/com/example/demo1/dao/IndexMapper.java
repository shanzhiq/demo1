package com.example.demo1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo1.entity.wd_carousel;
import com.example.demo1.entity.wd_system_msg;
import com.example.demo1.entity.wd_product;
import com.example.demo1.entity.wd_category;

@Mapper
public interface IndexMapper {
    @Select("select * from wd_carousel order by sort desc")
    public List<wd_carousel> getCarouselData();

    @Select("select * from wd_system_msg order by sort desc")
    public List<wd_system_msg> getSystemMsgData();

    @Select("select id, pro_name, pro_pic_url, prompt_msg, lenders_number, monthly_interest_rate, lending_time, " +
            "loan_amount, pro_link from wd_product where is_del = 2 and is_online = 1 and is_top = 1")
    public List<wd_product> getTopData();

    @Select("select id, pic_url, cate_name from wd_category order by sort desc limit 3")
    public List<wd_category> getCateData();

    @Select("select id, pro_name, pro_pic_url, prompt_msg, lenders_number, monthly_interest_rate, lending_time, " +
            "loan_amount, pro_link from wd_product where is_del = 2 and is_online = 1 and is_top = 1 limit #{param1}, #{param2}")
    public List<wd_product> getProductData(int start, int ps);

    @Select("select a.id, a.pro_name, a.pro_pic_url, a.prompt_msg, a.lenders_number, a.monthly_interest_rate, a.lending_time, " +
            "a.loan_amount, a.pro_link from wd_product as a join wd_pro_cate as b on a.id = b.pro_id where" +
            " b.cate_id=#{param1} and a.is_del = 2 and a.is_online = 1 and a.is_top = 1 limit #{param2}, #{param3}")
    public List<wd_product> getCateProductData(int c, int start, int ps);
}
