package org.hoanguyen.register.controller;

import jakarta.validation.Valid;
import org.hoanguyen.register.dto.AccountDTO;
import org.hoanguyen.register.dto.MemberDTO;
import org.hoanguyen.register.dto.UserDTO;
import org.hoanguyen.register.exception.UserExistException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.UUID;

@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());

    MemberDTO memberDTO;
    AccountDTO accountDTO;
    UserDTO userDTO;
    @GetMapping("/")
    public String index()
    {

        return "index";
    }

    @GetMapping("/login")
    public String login() {

            return "login";
        }



        @RequestMapping("/home")
        public String redirectToDetail()
        {

            return "redirect:/detail";
        }
    }