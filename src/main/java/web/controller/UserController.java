package web.controller;

import javax.persistence.Index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping(value="/")
    public String MainPage(ModelMap model){

        model.addAttribute("message", "Welcome to the MainPage");
        return "index";

    }

}
