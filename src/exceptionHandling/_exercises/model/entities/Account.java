package exceptionHandling._exercises.model.entities;

import exceptionHandling._exercises.model.exceptions.BusinessException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double WhithDrawLimit;

    public Account(int number, String holder, double balance, double whithdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        WhithDrawLimit = whithdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWhithdrawLimit() {
        return WhithDrawLimit;
    }

    public void setWhithdrawLimit(double whithdrawLimit) {
        WhithDrawLimit = whithdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void whithdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWhithdrawLimit()) {
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Withdraw error: Not enough balance");
        }
    }
}
