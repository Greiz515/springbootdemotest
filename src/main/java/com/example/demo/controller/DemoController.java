package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : greiz
 * @date :2018/7/30 17:03
 * @project :demoTest
 **/
@RestController
public class DemoController {
    /**
     * create by: Greiz
     * description: create a springboot Demo
     * create time: 17:31 2018/7/30
     *
      * @Param: null
     * @return : java.lang.String
     */
    @GetMapping("/mysayhello")
   public String sayHello(){
        return "i am handsome";
    }

}
