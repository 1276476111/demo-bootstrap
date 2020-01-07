package com.qsn.bootstrap.modules.service;

import com.baomidou.mybatisplus.service.IService;
import com.qsn.bootstrap.modules.entity.UserCoupon;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author qsn
 * @since 2020-01-07
 */
public interface UserCouponService extends IService<UserCoupon> {

    /**
     * 根据用户名获取用户信息
     */
    List<UserCoupon> selectByUserName(String selectByUserName);
}
