package org.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/user")
    public String home(Model model)  {
        User user = new User();
        user.setName("");
        model.addAttribute(user);
        return "users";
    }

    @GetMapping("/newUser")
    public String newUser(User user) {
        return "users";

    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }

}
