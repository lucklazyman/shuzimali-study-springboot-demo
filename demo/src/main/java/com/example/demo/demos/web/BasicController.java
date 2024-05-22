
package com.example.demo.demos.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello()  {
        return "world";
    }
}
