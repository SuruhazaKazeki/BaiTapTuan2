/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT02;

/**
 *
 * @author Acer
 */
public class Tron {
    private double banKinh;
    
    public Tron(){
        this(1.0);
    }
    public Tron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double getChuVi(){
        return banKinh*2*Math.PI;
    }
    public double getDienTich(){
        return Math.sqrt(banKinh)*Math.PI;
    }
    public void xuat() {
        System.out.println("HT:[ ban kinh:"+banKinh+", Chu vi = "+getChuVi()+",dien tich = "+getDienTich());
    }
}
