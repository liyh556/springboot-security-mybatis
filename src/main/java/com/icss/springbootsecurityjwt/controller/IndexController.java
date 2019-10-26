package com.icss.springbootsecurityjwt.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 */
@Controller
@Log4j2
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
