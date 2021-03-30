package com.VedantChokshiC0779423_Assignment78;

public class Bank {
    //Class member variables
    long accountNo;
    String accountHolder;
    double balance;

    //Parameterised Constructor method
    public Bank(long accountNo, String accountHolder) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }
    //Getters method
    public long getAccountNo() { return accountNo; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    //Setters method
    public void setAccountNo(long accountNo) { this.accountNo = accountNo; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public void setBalance(double balance) { this.balance = balance; }

    //Deposit method
    void deposit(double money){ this.balance += money; }
    //Withdraw money method
    void withdraw(double money){ this.balance -= money; }
    @Override

    public String toString(){

        return String.format("Account No. \t" + accountNo +"\nAccount Holder \t" + accountHolder + "\nBalance \t\t" + this.balance);
    }
}
