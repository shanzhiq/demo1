package com.example.demo1.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class wd_product {
    private int id;
    private String pro_name;
    private String pro_pic_url;
    private String pro_link;
    private int grade;
    private String telephone;
    private String created_time;
    private int lenders_number;
    private String prompt_msg;
    private String loan_amount;
    private String cycle;
    private String monthly_repayment;
    private float monthly_interest_rate;
    private String lending_time;
    private String requirement;
    private String material;
    private int is_del;
    private int is_top;
    private int is_online;
    private int apply_click;
}
