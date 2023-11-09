package com.account.Account.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountPageController {

    @GetMapping("/account/create")
    public String showCreateAccountPage() {
        return "createAccount"; // Nombre del archivo HTML sin la extensión ".html"
    }
}
