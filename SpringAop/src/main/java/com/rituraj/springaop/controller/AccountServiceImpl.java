package com.rituraj.springaop.controller;

import com.rituraj.springaop.controller.AccountService;
import org.springframework.stereotype.Service;

@Service("accountservice")
public class AccountServiceImpl implements AccountService {

    public void updateAccountBalance(Account account,Long amount) {
        System.out.println( "Account no "+account.getAccountNo()+", amount "+amount);
        System.out.println("balance update Ho gya");
    }

}
