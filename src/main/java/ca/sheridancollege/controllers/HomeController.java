package ca.sheridancollege.controllers;

import ca.sheridancollege.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// This is a random commit comment. Commit 2

// Random change here

// Another change

// Just a commit

// added a comment

// add to branch 1
@Controller
public class HomeController {
    @GetMapping("/registerpage")
    public String register() {
        return "registerpage";
    }

    @PostMapping("/registered")
    public String registered(@RequestParam String fName,
                             @RequestParam String lName,
                             @RequestParam String address,
                             @RequestParam (defaultValue="off") boolean remember,
                             Model model) {

        User user = new User(fName, lName, address, remember);
        model.addAttribute("user", user);
        return "registered";
    }

}
