package com.example.ex09.Controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserHobbiesController {
    @PostMapping("/submitUserHobbies")
    public String submitUserHobbies(@RequestParam String name, @RequestParam String hobbies, Model model) {
        List<String> hobbiesList = Arrays.asList(hobbies.split(","));
        model.addAttribute("name", name);
        model.addAttribute("hobbies", hobbiesList);
        return "show-hobbies";
    }
}
