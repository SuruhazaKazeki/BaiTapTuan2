/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT03;

/**
 *
 * @author Acer
 */
public abstract class SinhVien {
    public String hoten,nganh;

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }
    abstract public double getDiem();
    
    public String getHL(){
        String kq="";
        double diemTB= getDiem();
        if(diemTB<5){
            kq="yeu";
        }else if(diemTB<6.5){
            kq="Trung Binh";
        }else if(diemTB<7.5){
            kq="Kha";
        }else if(diemTB<9){
            kq="Gioi";
        }else{
            kq="Xuat Sac";
        }
        return kq;
    }
    public void xuat(){
        System.out.println("SinhVien[Ho ten"+ hoten+",nganh: "+nganh+",DiemTB"+getDiem()+", Hoc luc: "+getHL());
    }
}
