package com.test.mvc.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")

public class ViewController {

    @GetMapping
    public String chat (){
        return "Hello, World I'm Get";
    }

    @PostMapping
    public String chat2 (){
        return "Hello, wolrd I'm Post";
    }
    @PutMapping
    public String chat3 (){
        return "Hello, World I'm Put";
    }

    @DeleteMapping
    public String chat4 (){
        return "Hello, World I'm Delete";
    }
    @PatchMapping
    public String chat5 (){
        return "Hello, World I'm Patch";
    }
}
