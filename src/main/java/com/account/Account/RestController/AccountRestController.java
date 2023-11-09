package com.account.Account.RestController;


import com.account.Account.Model.Account;
import com.account.Account.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountRestController {

    private final AccountService accountService;

    @Autowired
    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Define los endpoints REST para gestionar cuentas bancarias
}
