package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lirf on 2021/7/11.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String hello()
    {
        return "Hello World!";
    }
}
