package com.icss.springbootsecurityjwt.controller;

import com.github.pagehelper.PageInfo;
import com.icss.springbootsecurityjwt.model.SysUser;
import com.icss.springbootsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户列表
     * @return
     */
    @RequestMapping("page")
    private PageInfo page(SysUser user){
        return   userService.page(user);
    }
    /**
     * 根据用户名获取用户信息
     * @return
     */
    @RequestMapping("findByUserName")
    private SysUser findByUserName(){
      return   userService.findByUserName("liyanghao");
    }
}
