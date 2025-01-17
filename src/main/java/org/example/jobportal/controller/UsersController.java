package org.example.jobportal.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.example.jobportal.entity.Users;
import org.example.jobportal.entity.UsersType;
import org.example.jobportal.service.UsersService;
import org.example.jobportal.service.UsersTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class UsersController {
    private final UsersTypeService usersTypeService;
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersTypeService usersTypeService, UsersService usersService) {
        this.usersTypeService = usersTypeService;
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersTypeList = usersTypeService.getAll();
        model.addAttribute("getAllTypes", usersTypeList);
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register/new")
    public String userRegistration(@Valid Users user, Model model) {
        // check if email is already exist
        Optional<Users> optionalUser = usersService.findUserByEmail(user.getEmail());

        if (optionalUser.isPresent()) {
            model.addAttribute("error", "User with this email already exist");
            List<UsersType> usersTypeList = usersTypeService.getAll();
            model.addAttribute("getAllTypes", usersTypeList);
            model.addAttribute("user", new Users());
            return "register";
        }

        usersService.addNewUser(user);
        return "redirect:/dashboard/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest req, HttpServletResponse res){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication !=null){
            new SecurityContextLogoutHandler().logout(req, res, authentication);
        }
        return "redirect:/";
    }
}
