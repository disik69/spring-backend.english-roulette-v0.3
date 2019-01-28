package ua.pp.disik.englishroulette.backend.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import ua.pp.disik.englishroulette.backend.entities.User;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    String read() {
        return "read users";
    }

    @GetMapping("/{id}")
    String read(@PathVariable Integer id) {
        return "read user";
    }

    @PostMapping()
    String create() {
        return "create user";
    }

    @PutMapping("/{id}")
    String update(@PathVariable Integer id) {
        return "update user";
    }

    @DeleteMapping()
    String delete() {
        return "delete users";
    }

    @DeleteMapping("/{id}")
    String delete(@PathVariable Integer id) {
        return "delete user";
    }
}
