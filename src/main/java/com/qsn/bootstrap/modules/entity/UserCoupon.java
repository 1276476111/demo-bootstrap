package com.qsn.bootstrap.modules.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author qsn
 * @since 2020-01-07
 */
@TableName("wx_user_coupon")
@Getter
@Setter
@ToString
public class UserCoupon {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private Integer sex;
    private Integer age;
    private BigDecimal money;
    private String remark;
    private Date createTime;
    private Date updateTime;
}
