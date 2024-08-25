/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT03;

/**
 *
 * @author Acer
 */
public class SinhVienIT extends SinhVien {
    public double diemjava,diemhtml,diemcss;

    public SinhVienIT(String hoten,double diemjava, double diemhtml, double diemcss ) {
        super(hoten, "IT");
        this.diemjava = diemjava;
        this.diemhtml = diemhtml;
        this.diemcss = diemcss;
    }

    @Override
    public double getDiem() {
        return (diemjava*2+diemhtml+diemcss)/4;
    }
}
