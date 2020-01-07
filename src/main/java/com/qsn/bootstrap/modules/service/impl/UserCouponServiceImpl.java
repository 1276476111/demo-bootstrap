package com.qsn.bootstrap.modules.service.impl;

import com.qsn.bootstrap.modules.entity.UserCoupon;
import com.qsn.bootstrap.modules.dao.UserCouponMapper;
import com.qsn.bootstrap.modules.service.UserCouponService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qsn
 * @since 2020-01-07
 */
@Service
public class UserCouponServiceImpl extends ServiceImpl<UserCouponMapper, UserCoupon> implements UserCouponService {

    /**
     * 根据用户名获取用户信息
     */
    @Override
    public List<UserCoupon> selectByUserName(String selectByUserName) {
        return baseMapper.selectByUserName(selectByUserName);
    }
}
