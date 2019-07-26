package com.springframework.service.impl;

import com.springframework.annotation.Service;
import com.springframework.service.IDemoService;

/**
 * Created by Administrator on 2018/8/1.
 */
@Service
public class DemoService implements IDemoService {
    @Override
    public String get(String name) {
        return "get in DemoService===>" + name;
    }
}
