package com.guigu.springcloud.service;

import com.guigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 功能描述：
 *
 * @Author: zy
 * @Date: 2023/7/24 17:56
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
