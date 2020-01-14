package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class IndexController {
	
	@RequestMapping("/")
    public String index(Model model) throws Exception{
        return "index";
    }
	
	@RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) throws Exception{
        return "thymeleaf";
    }
	
	@RequestMapping("/oracle")
    public String oracle(Model model) throws Exception{
        return "oracle";
    }
	
}




