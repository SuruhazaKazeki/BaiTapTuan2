/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.bt01;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ChuongTrinh {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        //khai bao 2 doi tuong r1 va r2 kieeur rectangle
        Rectangle r1,r2;
        //tao doi tuong r1
        System.out.print("tao doi tuong r1...");
        r1 = new Rectangle();
        //tao doi tuong r2
        System.out.print("tao doi tuong r2...");
        System.out.print("cho biet chieu dai:");
        double dai = s.nextDouble();
        System.out.print("cho biet chieu rong:");
        double rong = s.nextDouble();
        r2 = new Rectangle(dai,rong);
        
        System.out.println("Ket qua:");
        System.out.println("HCN thu 1: -dai: "+r1.getDai()+"-rong: "+r1.getRong()+"-Dien Tich: "+ r1.TinhDienTich()+"-Chu vi: "+ r1.TinhDienTich());
        System.out.println("HCN thu 2: -dai: "+r2.getDai()+"-rong: "+r2.getRong()+"-Dien Tich: "+ r2.TinhDienTich()+"-Chu vi: "+ r2.TinhDienTich());
    }
}
