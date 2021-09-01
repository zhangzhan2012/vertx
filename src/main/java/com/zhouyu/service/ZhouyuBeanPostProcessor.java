package com.zhouyu.service;

import com.spring.BeanPostProcessor;
import com.spring.Component;

@Component
public class ZhouyuBeanPostProcessor implements BeanPostProcessor {

    @Override
    public void postProcessBeforeInitialization(String beanName, Object bean) {

    }

    @Override
    public void postProcessAfterInitialization(String beanName, Object bean) {
        System.out.println("postProcessAfterInitialization");
    }
}
