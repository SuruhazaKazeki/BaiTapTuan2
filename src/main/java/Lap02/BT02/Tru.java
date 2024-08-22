/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT02;

/**
 *
 * @author Acer
 */
public class Tru extends Tron {

    private double chieuCao;
    public Tru(){
        super(1.0);
        chieuCao=1.0;
    }
    public Tru(double chieuCao, double banKinh) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    @Override
    public double getDienTich() {
        return Math.sqrt(super.getDienTich())+super.getDienTich()*chieuCao;
    }

    public double getTheTich() {
        return super.getDienTich()* chieuCao;
    }

}
