package web.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String userPage(Model model,
                           @AuthenticationPrincipal UserDetails userDetails){
        model.addAttribute("user",userDetails);
        return "user";
    }
}
