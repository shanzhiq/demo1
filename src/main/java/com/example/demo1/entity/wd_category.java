package com.example.demo1.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class wd_category {
    private int id;
    private String cate_name;
    private int cate_pid;
    private String pic_url;
    private int sort;
}
