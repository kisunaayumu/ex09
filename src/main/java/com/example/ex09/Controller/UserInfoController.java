package com.example.ex09.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
@RequestMapping("/user")
public class UserInfoController {
     @PostMapping("/submitUserInfo")
    public String submitUserInfo(@RequestParam String name, @RequestParam String age) {
        RequestContextHolder.getRequestAttributes().setAttribute("name", name, RequestAttributes.SCOPE_REQUEST);
        RequestContextHolder.getRequestAttributes().setAttribute("age", age, RequestAttributes.SCOPE_REQUEST);
        return "Data saved to request scope";
    }
    @GetMapping("/displayUserInfo")
    public String displayUserInfo() {
        String name = (String) RequestContextHolder.getRequestAttributes().getAttribute("name", RequestAttributes.SCOPE_REQUEST);
        String age = (String) RequestContextHolder.getRequestAttributes().getAttribute("age", RequestAttributes.SCOPE_REQUEST);
        return "こんにちは、" + name + "さん。あなたは" + age + "歳ですね。";
    }
    
}
