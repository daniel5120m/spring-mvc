package com.example.springmvc.controllers;

import com.example.springmvc.forms.UserForm;
import com.example.springmvc.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final UserService userService;

    @PostMapping("/useradd")
    public String addUser(@ModelAttribute UserForm userForm, Model model) {
        System.out.println(userForm.firstName);
        System.out.println(userForm.lastName);
        model.addAttribute("userForm", new UserForm());
        return "adduser";
    }

    @GetMapping("/useradd")
    public String addUser(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "adduser";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        System.out.println("Usowamy usera o id=" + id);
        userService.deleteById(id);
        model.addAttribute("users", userService.findAll()); //w modelu muszą być dane, bo w return mamy "users" i chcemy, by po usunięciu wyświetlili się usery
        return "users";
    }


        @GetMapping("/users")
        public String getAll (Model model){
            model.addAttribute("users", userService.findAll());
            return "users";
        }

        @GetMapping("/")
        public String index (Model model){

            // model.addAttribute("userInputForm". new UserInputForm());
            model.addAttribute("userForm", new UserForm("Zenek", "Kiszka"));


            return "index";
        }
    }
