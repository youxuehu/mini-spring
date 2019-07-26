package com.springframework.controller;


import com.springframework.annotation.Controller;
import com.springframework.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/8/2.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public void h1(HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.getWriter().write("h1");
    }
    @RequestMapping("/h2")
    public  void h2(HttpServletResponse response, HttpServletRequest request)throws Exception{
        response.getWriter().write("h2");
    }
    @RequestMapping("/h3")
    public void h3(HttpServletResponse response, HttpServletRequest request)throws Exception{
        response.getWriter().write("h3");
    }
    @RequestMapping("/h4")
    public void h4(HttpServletResponse response, HttpServletRequest request)throws Exception{
        response.getWriter().write("h4");
    }
}
