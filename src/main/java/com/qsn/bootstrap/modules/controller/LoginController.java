package com.qsn.bootstrap.modules.controller;

import com.qsn.bootstrap.modules.dao.UserCouponMapper;
import com.qsn.bootstrap.modules.entity.UserCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 登录
 */

@Controller
public class LoginController {

    @Autowired
    private UserCouponMapper userMapper;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/login")
    public String login(@RequestParam String url){
        return url;
    }

    @GetMapping("/select")
    @ResponseBody
    public UserCoupon selectUser() {
        // 查询 User
        UserCoupon exampleUser = userMapper.selectById(1);
        return exampleUser;
    }

    /**
     * 简单登录验证
     */


}
