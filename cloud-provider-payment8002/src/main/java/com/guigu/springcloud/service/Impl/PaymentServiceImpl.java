package com.guigu.springcloud.service.Impl;

import com.guigu.springcloud.dao.PaymentDao;
import com.guigu.springcloud.entities.Payment;
import com.guigu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述：
 *
 * @Author: zy
 * @Date: 2023/7/24 17:57
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
