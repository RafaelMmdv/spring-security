package com.example.frontcrud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping ("/index")
    public String home(){
        return "index";

    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('USER')")
    public String userProfile() {
        return "user";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String adminProfile() {
        return "admin";
    }

}
