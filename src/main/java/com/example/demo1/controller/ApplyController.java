package com.example.demo1.controller;

import java.util.HashMap;
import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import com.example.demo1.entity.wd_product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apply")


public class ApplyController {
    @RequestMapping(value={"/check_code"}, method=RequestMethod.POST)
    public String return_val_code(@RequestBody Message msg){
        System.out.println(msg.getCode());
        return "success";
    }
}

class Message {
    private String code;
    private String token;
//    private String content;

    public Message() {}

    public String getCode() {
        return this.code;
    }

    public String getToken() {
        return this.token;
    }

//    public void setFrom(String value) {
//        this.from = value;
//    }
//
//    public void setTo(String value) {
//        this.to = value;
//    }
//
//    public void setContent(String value) {
//        this.content = value;
//    }
}
