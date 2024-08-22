/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT02;


/**
 *
 * @author Acer
 */
public class Programs {

    public static void main(String[] args) {
        Tron h1 = new Tron(4.0);
        System.out.println("HT:[ ban kinh:"+h1.getBanKinh()+", Chu vi = "+h1.getChuVi()+",dien tich = "+h1.getDienTich());
        Tru h2 = new Tru(3.0,2.0);
        System.out.println("HT:[ ban kinh:" + h2.getBanKinh() + ",chieu cao =" + h2.getChieuCao() + ", The tich = " + h2.getTheTich() + ",dien tich = " + h2.getDienTich());
    }
}