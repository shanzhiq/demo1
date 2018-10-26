package com.example.demo1.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class wd_user {

    private int id;
    private String username;
    private String password;
    private String nickname;
    private String icon_url;
    private String reg_time;
    private String last_time;
    private int cha_id;
    private String truename;
    private int birth_year;
    private int zmf;
    private String reg_ip;
    private String phone_type;
}
