/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.bt01;
/**
 *
 * @author Acer
 */
public class Rectangle {
    private double dai,rong;
    
    public Rectangle(){
        dai=4;
        rong=2;
    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }
    
    public double TinhDienTich(){
        
        return dai*rong;
    }
    public double TinhChuVi(){
        return (dai+rong)*2;
    }
    
}
