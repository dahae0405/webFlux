package com.reactor.webflux.controller;

import com.reactor.webflux.model.User;
import com.reactor.webflux.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import java.time.Duration;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Controller
public class UserViewController {
    private final UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        Flux<User> users = userService.findAll().delayElements(Duration.ofSeconds(1));
        IReactiveDataDriverContextVariable userDataDrivenMode = new ReactiveDataDriverContextVariable(users, 1);

        model.addAttribute("users", userDataDrivenMode);

        return "index";
    }
}
