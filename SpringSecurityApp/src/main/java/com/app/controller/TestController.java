package com.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/method")
public class TestController {

    @GetMapping("/get")
    public String callGet(){
        return "Method Called With GET";
    }

    @PostMapping("/post")
    public String callPost(){
        return "Method Called With POST";
    }

    @PutMapping("/put")
    public String callPut(){
        return "Method Called With PUT";
    }

    @PatchMapping ("/patch")
    public String callPatch(){
        return "Method Called With PATCH";
    }

    @DeleteMapping("/delete")
    public String callDelete(){
        return "Method Called With DELETE";
    }
}
