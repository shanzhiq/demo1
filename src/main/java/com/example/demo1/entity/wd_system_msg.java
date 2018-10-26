package com.example.demo1.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class wd_system_msg {
    private int id;
    private String msg_content;
    private String create_time;
    private int sort;
}