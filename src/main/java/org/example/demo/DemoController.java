package org.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {


    @GetMapping("/")
    public String home(Model model)  {
        User user = new User();
        user.setName("name");
        model.addAttribute(user);
        return "home";
    }

    @GetMapping("/newUser")
    public String newUser(User user) {
        return "home";

    }


}
