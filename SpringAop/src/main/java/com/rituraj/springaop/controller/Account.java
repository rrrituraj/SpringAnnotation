package com.rituraj.springaop.controller;

/**
 * Created by RITURAJ on 27-06-2017.
 */
public class Account {

    private int AccountNo;
    private String AccountDesc;

    public Account(int accountNo, String accountDesc) {
        AccountNo = accountNo;
        AccountDesc = accountDesc;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public String getAccountDesc() {
        return AccountDesc;
    }
}
