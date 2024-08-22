/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.BT03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Programs {

    static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int chon = 5;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("=== QUAN LY SINH VIEN ===");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("5. Kết thúc");
            System.out.println("==========================");
            System.out.println("Vui long chon tu 1 - 5");
            chon = s.nextInt();
            switch (chon) {

                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
        }while(chon!=5);
    }

    private static void Nhap() {
        String tiepTuc="y";
        
    }

    private static void Xuat() {
        
    }
    
}
