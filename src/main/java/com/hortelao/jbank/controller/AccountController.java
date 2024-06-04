package com.hortelao.jbank.controller;

import com.hortelao.jbank.model.Account;
import com.hortelao.jbank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

        @Autowired
        private AccountService accountService;

        @GetMapping("/create")
        public String createAccount() {
            Account account = new Account();

            System.out.println(account);
            accountService.createAccount(account);
            return "Account created";
        }

    @GetMapping("/test")
    public String test() {
        return "Test working";
    }
}
