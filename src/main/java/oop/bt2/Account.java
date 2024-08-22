/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt2;

/**
 *
 * @author Acer
 */
public class Account {
    private String id, name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void credit(int amount){
        if (amount>0)
        {
            balance+=amount;
        }
    }
    public void debit(int amount){
        if (balance>amount)
        {
            balance-=amount;
            System.out.println("Giao dich thanh cong");
        }else{
            System.out.println("Giao dich that bai! do so du tai khoan khong du de giao dich");
        }
    }
    public void tranferTo(Account tk,int amount ){
        if (balance>=amount)
        {
            balance-=amount;
            tk.balance += amount;
            System.out.println("Giao dich thanh cong");
        }else{
            System.out.println("Giao dich that bai! do so du tai khoan khong du de giao dich");
        }
    }
    
}
