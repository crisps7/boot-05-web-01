package com.monet.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/success")
    public String success(Model model){
        //model中的数据会被放在请求域中
        model.addAttribute("msg","hello");
        model.addAttribute("link","www.baidu.com");
        return "success";
    }
}
