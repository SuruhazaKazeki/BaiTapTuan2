/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT01;

/**
 *
 * @author Acer
 */
public class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh);// goi contructor cua lop cha
    }

    @Override
    public void xuat() {
        System.out.println("HV[Canh=" + super.dai + ",chu vi: " + super.getChuVi() + ",dien tich:" + super.getDienTich());
    }

}
