package com.mlkgit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 4/24/2017.
 */
@Controller
public class HelloworldController {
    @RequestMapping("/")
public String sayHello(){

return"Index";
}
}


