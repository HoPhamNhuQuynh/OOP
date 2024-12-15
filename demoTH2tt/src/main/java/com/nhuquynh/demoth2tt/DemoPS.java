/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2tt;

/**
 *
 * @author admin
 */
public class DemoPS {

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(2, 2);
        PhanSo p3 = new PhanSo(3, 2);
        PhanSo p4 = new PhanSo(4, 2);
        PhanSo p5 = new PhanSo(5, 2);

        DsPhanSo ql = new DsPhanSo();
        ql.themPS(p1);
        ql.themPS(p2, p3, p4, p5);
//        ql.themPS();

        ql.hienThi();

        System.out.println("\n ========");
//        ql.xoaPS(p2);
        ql.xoaPS(4, 8);

        System.out.print("Tong cac phan so = ");
        ql.tong().hienThi();
        System.out.println("");
        System.out.print("Max = ");
        ql.timMax().hienThi();
        System.out.println("");
        System.out.print("Min = ");
        ql.timMin().hienThi();
        System.out.println("");

        ql.sapXep();
        ql.hienThi();

    }
}
