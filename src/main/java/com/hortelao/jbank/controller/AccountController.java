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

        @PostMapping("/create")
        public ResponseEntity<Account> createAccount(@RequestBody Account account) {
            return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);
        }

    @GetMapping("/test")
    public String test() {
        return "Test working";
    }
}
