package com.qsn.bootstrap.modules.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.qsn.bootstrap.modules.entity.UserCoupon;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author qsn
 * @since 2020-01-07
 */
public interface UserCouponMapper extends BaseMapper<UserCoupon> {


    /**
     * 根据用户名获取用户信息
     */
    List<UserCoupon> selectByUserName(String userName);

}
