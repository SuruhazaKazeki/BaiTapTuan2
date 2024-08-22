/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT01;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Program {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap thong tin HCN");
        System.out.print("Nhap chieu dai: ");
        double dai = s.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = s.nextDouble();
        ChuNhat hcn = new ChuNhat(dai, rong);
        hcn.xuat();

        System.out.println("Nhap thong tin HV");
        System.out.print("Nhap canh: ");
        double canh = s.nextDouble();
        ChuNhat hv = new Vuong(canh);
        hv.xuat();
    }
}
