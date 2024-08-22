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
    public double diemMaketing,sales;

    public SinhVienBiz(double diemMaketing, double sales, String hoten) {
        super(hoten,"Biz");
        this.diemMaketing = diemMaketing;
        this.sales = sales;
    }
    
}
