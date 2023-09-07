package prospring.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class hello {

    @GetMapping("/hello")
    public String showIndex(Model model) { 
        model.addAttribute("title", "hello");
        return "index";
    }
}
