/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt2;

/**
 *
 * @author Acer
 */
public class ChuongTrinh {
    public static void main (String[]args){
        Account tk1= new Account("TK01","Hokuto",100000000);
        Account tk2= new Account("TK02","Ayame",50000000);
        System.out.println("Thong tin tai khoan ban dau:");
        System.out.println("My Account[id: " + tk1.getId() + ", name: " + tk1.getName() + ", balance: " + tk1.getBalance() + "]");
        System.out.println("MyFriend Account[id: " + tk2.getId() + ", name: " + tk2.getName() + ", balance: " + tk2.getBalance() + "]");
        
        System.out.println("Rut 2000000 tien tu tai khoan My Account.....");
        tk1.debit(2000000);
        
        System.out.println("Nap 10000000 vao tai khoan MyFriend Account.....");
        tk2.credit(10000000);
        
        System.out.println("Chuyen khoan 5000000 tu myAccount to myFriend.....");
        tk1.tranferTo(tk2, 5000000);
        
        System.out.println("Thong tin tai khoan sau giao dich:");
        System.out.println("My Account[id: " + tk1.getId() + ", name: " + tk1.getName() + ", balance: " + tk1.getBalance() + "]");
        System.out.println("MyFriend Account[id: " + tk2.getId() + ", name: " + tk2.getName() + ", balance: " + tk2.getBalance() + "]");
    }
}
