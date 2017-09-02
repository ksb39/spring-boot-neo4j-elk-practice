package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ksb on 2017. 9. 2..
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }

}
