/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT03;

/**
 *
 * @author Acer
 */
public class SinhVienBiz extends SinhVien {
    public double diemMarketing,sales;

    public SinhVienBiz(String hoten,double diemMarketing, double sales) {
        super(hoten,"Biz");
        this.diemMarketing = diemMarketing;
        this.sales = sales;
    }
    @Override
    public double getDiem() {
        return(diemMarketing*2+sales)/3;
    }
    
}
