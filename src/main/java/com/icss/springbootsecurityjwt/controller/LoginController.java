package com.icss.springbootsecurityjwt.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录，退出管理
 */
@Controller
@Slf4j
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        log.info("login");
        return "login";
    }

}
