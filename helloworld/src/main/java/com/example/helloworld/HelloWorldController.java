package com.example.helloworld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

class HelloWorldController{

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1";
    }
    @GetMapping("/hello2")
    public String hello2(Model model){
        model.addAttribute("name","rahul");
        return "hello2";

    }
    @GetMapping("/hello3")
    public String hello3(@RequestParam(name = "name",required = false,defaultValue = "World") String name,Model model){
        model.addAttribute("name", name);
        return "hello2";
    }
}