package com.codexmaker.model;

/** cette classe est destinee au compte bancaire */
public class Account {
    int id;
    String accountNumber;
    Client client;
    double balance;

    /** Constructeurs de la classe Account */
    public Account(int id, String accountNumber, Client client, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }
    public Account(){

    }


    /** Getters de la classe Account */
    public int getId() {
        return id;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public Client getClient() {
        return client;
    }
    public double getBalance() {
        return balance;
    }

    /** Setters de la classe Account */
    public void setId(int id) {
        this.id = id;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setClient(Client client){
        this.client = client;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    /** Redefinition de la methode toString() */
    @Override
    public String toString(){
        return "Account{id=" + id + ", accountNumber='" + accountNumber + "', client=" + client.getName() + ", balance=" + balance + "}";   
    }
}
