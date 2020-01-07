package com.qsn.bootstrap.modules.controller;


import com.qsn.bootstrap.modules.entity.UserCoupon;
import com.qsn.bootstrap.modules.service.UserCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author qsn
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/userCoupon")
public class UserCouponController {
    @Autowired
    private UserCouponService userCouponService;

    @GetMapping("selectByUserName")
    public List<UserCoupon> selectByUserCoupon(@RequestParam String userName) {
        List<UserCoupon> userCoupons = userCouponService.selectByUserName(userName);
        return userCoupons;
    }


}

