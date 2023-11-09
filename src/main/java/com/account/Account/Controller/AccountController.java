package com.account.Account.Controller;




import com.account.Account.Model.Account;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/account")
public class AccountController {

    private Account account;

    public AccountController() {
        // Creas una cuenta bancaria inicial
        this.account = new Account("Propietario", 1000.0);
    }

    @GetMapping("/balance")
    public String getBalance() {
        return account.toString();
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam double amount) {
        account.deposit(amount);
        return "Depósito exitoso.";
    }

    @PostMapping("/withdrawal")
    public String withdrawal(@RequestParam double amount) {
        account.withdrawal(amount);
        return "Retiro exitoso.";
    }
}
