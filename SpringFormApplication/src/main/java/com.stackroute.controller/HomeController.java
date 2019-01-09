package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    User user = new User();

    @RequestMapping(value = "/")
    public String userLogin() {

            return "index";

    }

        @RequestMapping(value="user")
        public String setUser(@RequestParam("userName")String name, @RequestParam("password") String pass, ModelMap map)
        {

            user.setUsername(name);
            user.setPassword(pass);

            map.addAttribute("user", user.getUsername());

            return "display";
        }
    }
