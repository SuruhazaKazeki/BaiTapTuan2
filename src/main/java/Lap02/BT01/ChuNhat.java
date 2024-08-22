/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT01;

/**
 *
 * @author Acer
 */
public class ChuNhat {

    public double dai, rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("HCN[dai =" + dai + ", rong= " + rong + " co chu vi = " + getChuVi() + ", dien tich = " + getDienTich());
    }
}
