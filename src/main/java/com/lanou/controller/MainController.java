package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dllo on 17/10/9.
 */
@Controller
public class MainController {

//    @RequestMapping(value = "/index")
//    public String first(){
//        return "home";
//    }

    @RequestMapping(value = "/infopage/{username}/{nickname}")
    public String infopage(@PathVariable("username") String name,
                        @PathVariable("nickname") String nick){
        System.out.println(name);
        System.out.println(nick);
        return "home";
    }









}
