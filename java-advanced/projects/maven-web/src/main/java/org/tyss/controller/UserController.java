package org.tyss.controller;

import org.tyss.model.User;
import org.tyss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "userList";
    }

    @GetMapping("/addUser")
    public String showAddUserForm() {
        return "addUser";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "userDetail";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name, @RequestParam String email) {
        Long newId = (long) (Math.random() * 1000);
        userService.addUser(new User(newId, name, email));
        return "redirect:/users";
    }
}
