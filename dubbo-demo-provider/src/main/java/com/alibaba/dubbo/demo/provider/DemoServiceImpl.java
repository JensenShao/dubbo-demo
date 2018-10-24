package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.demo.DemoService;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-10-23-18:03
 **/
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello "+name +" (from springboot))";
    }
}
