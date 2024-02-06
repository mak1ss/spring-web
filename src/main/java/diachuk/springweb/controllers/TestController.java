package diachuk.springweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping
    public String getInfo(Model model){
        model.addAttribute("list", List.of("Hello", "Spring", "Boot"));
        model.addAttribute("string", "Made by Diachuk Maksym");
        return "index";
    }
}
