package com.account.Account.Service;

import com.account.Account.Model.Account;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private List<Account> accounts;

    public AccountService() {
        // Inicializa el ArrayList de cuentas con una cuenta de ejemplo
        accounts = new ArrayList<>();
        accounts.add(new Account("Propietario", 1000.0));
    }

    // Agrega una nueva cuenta al ArrayList
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Obtiene el saldo de una cuenta específica por índice
    public double getBalance(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index).getBalance();
        }
        return 0.0; // Manejo de errores en caso de índice no válido
    }

    // Obtiene todas las cuentas en el ArrayList
    public List<Account> getAllAccounts() {
        return accounts;
    }

    // Realiza un depósito en una cuenta específica por índice
    public void deposit(int index, double amount) {
        if (index >= 0 && index < accounts.size() && amount > 0) {
            accounts.get(index).deposit(amount);
        }
    }

    // Realiza un retiro de una cuenta específica por índice
    public void withdrawal(int index, double amount) {
        if (index >= 0 && index < accounts.size() && amount > 0) {
            accounts.get(index).withdrawal(amount);
        }
    }
}
