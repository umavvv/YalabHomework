package org.example.Model;
//Класс описания для игрока
public class Gamer {
    private int balance;
    private int transaction;
    private String customerName;
    private String password;
    private int idTransaction;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int previousTransaction) {
        this.transaction = previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }
}
