package diachuk.springweb.controllers;

import diachuk.springweb.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping
    public String getInfo(Model model){
        model.addAttribute("list", List.of("Hello", "Spring", "Boot"));
        model.addAttribute("string", "Made by Diachuk Maksym");
        //       model.addAttribute("greeting", "Hello!");
        HashMap<String, String> map  = new HashMap<>();

        map.put("Kyiv", "The capital of Ukraine");
        map.put("Vienna", "The capital of Hungary");

        model.addAttribute("map", map);

        model.addAttribute("user", new User("Andrew", 23));


        return "index";
    }
}
