package com.springframework.controller;


import com.springframework.annotation.Autowired;
import com.springframework.annotation.Controller;
import com.springframework.annotation.RequestMapping;
import com.springframework.annotation.RequestParam;
import com.springframework.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/8/1.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private IDemoService service;
    @RequestMapping("/get")
    public void get(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response)throws Exception{
        String username = service.get(name);
        response.getWriter().write("get method====>"+username);
    }

    @RequestMapping("/save")
    public void save(
            @RequestParam("name") String name,
            HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.getWriter().write("get method");
    }

}
