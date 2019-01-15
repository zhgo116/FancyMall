package com.fancy.tmall.modules.main.web.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloBeetlController {

    private static Logger logger = LoggerFactory.getLogger(HelloBeetlController.class);

    /**
     * 测试beetl模板
     *
     * @return
     */
    @GetMapping("/add")
    public ModelAndView home() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("add");

        return modelAndView;
    }

    /**
     * 测试beetl模板
     *
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView();
        logger.info("add request");
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("index");

        return modelAndView;
    }

}