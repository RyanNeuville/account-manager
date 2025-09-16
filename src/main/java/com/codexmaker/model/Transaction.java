package com.codexmaker.model;

import java.time.LocalDateTime;

public class Transaction {
    int id;
    Account account;
    double amount;
    String type;
    LocalDateTime dateTime;

    /** Constructeur de la classe Transaction */
    public Transaction(int id, Account account, double amount, String type, LocalDateTime dateTime) {
        this.id = id;
        this.account = account;
        this.amount = amount;
        this.type = type;
        this.dateTime = dateTime;
    }
    public Transaction() {

    }

    /** Getters de la classe Transaction */
    public int getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /** Setters de la classe Transaction */
    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Redefinition de la methode toString pour afficher les informations d'une
     * transaction
     */
    @Override
    public String toString() {
        return "Transaction{id=" + id + ", account=" + account.getAccountNumber() + ", amount=" + amount + ", type='"
                + type + "', dateTime=" + dateTime + "}";
    }

}
