package com.zhouyu;

import com.spring.ZhouyuApplicationContext;
import com.zhouyu.service.OrderService;
import com.zhouyu.service.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        ZhouyuApplicationContext applicationContext = new ZhouyuApplicationContext(AppConfig.class);
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");
        orderService.test();
    }
}
