/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

import java.io.FileNotFoundException;

/**
 *
 * @author admin
 */
public class demo2 {

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
        
        System.out.println();
        ql.nhapDiemDs();
        ql.hienThi();
        
        System.out.println("=====");
        ql.timKiem().forEach(h->h.hienThi());
        ql.timKiem("Nguyen").forEach(h->h.hienThi());
        ql.timKiem(7).hienThi();
    }
}
