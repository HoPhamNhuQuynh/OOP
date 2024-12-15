/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2tt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class DemoHV {

    public static void main(String[] args) throws FileNotFoundException {
        HocVien h1 = new HocVien("Nguyen Ngoc A", "12/09/2003");
        HocVien h2 = new HocVien("Nguyen Ngoc B", "02/04/2005");
        HocVien h3 = new HocVien("Nguyen Ngoc C", "30/11/2002");
        HocVien h4 = new HocVien("Nguyen Ngoc D", "24/07/2004");
        HocVien h5 = new HocVien("Nguyen Ngoc E", "20/11/2005");

        QuanLyHocVien ql = new QuanLyHocVien();
//        ql.themHV(h1, h2, h3, h4, h5);
        ql.themHV("src/main/resources/hocvien.txt");
        ql.hienThi();
//        
//        System.out.println();
//        ql.nhapDiemDs();
//        ql.hienThi();
        
//        System.out.println("=====");
//        ql.timKiem().forEach(h->h.hienThi());
//        
//        System.out.println("=====");
//        ql.timKiem("Nguyen").forEach(h->h.hienThi());
//        
//        System.out.println("=====");
//        ql.timKiem(7).hienThi();
//        
//        System.out.println("=====");
//        ql.sapXep();
//        ql.hienThi();

//        
//        ql.xuatHB("src/main/resources/hocbong.txt");
        System.out.printf("So hoc vien co tuoi nho hon 18 = %d\n", ql.demNho18());
        System.out.printf("So hoc vien co tuoi lon hon 24 = %d\n", ql.demLon24());
        System.out.printf("So hoc vien co tuoi lon hon 18 va nho hon 24 = %d\n", ql.dem18To24());
    }
}
