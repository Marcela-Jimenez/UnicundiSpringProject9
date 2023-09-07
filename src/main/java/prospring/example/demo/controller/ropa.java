package prospring.example.demo.controller;

//import java.nio.file.Files;
//import java.nio.file.Paths;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ropa {

    @GetMapping("/ropa")
    public String showIndex(Model model) { 
        model.addAttribute("title", "ropa");
        return "index";
    }
}
