package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

class ProductController {

    @GetMapping("/product")

    public String product(Model model){
            model.addAttribute("product",new Product());
            return "product";
    }

    @PostMapping("/saveProduct")
    
    public String saveProduct(@ModelAttribute("product")Product product){
        return "product-display";
    }

}