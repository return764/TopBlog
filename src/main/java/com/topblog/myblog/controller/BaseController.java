package com.topblog.myblog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: RETURN
 * @Date: 2020/3/25 17:24
 */
@Controller
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("hello")
    public String hello(){
//        logger.trace();
//        logger.info();
//        logger.debug();
//        logger.error();
//        logger.warn();
        return "index";
    }
    @RequestMapping("create")
    public String create(){
        return "create";
    }
}