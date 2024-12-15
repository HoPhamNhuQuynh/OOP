/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class demo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // Bai 01
//        Ellipse e1 = new Ellipse(55, 40);
//        Ellipse e2 = new Circle(45);
//        
//        System.out.println(e1);
//        System.out.println(e2);

        // Bai 02
//        try {
//            TamGiac t1 = new TamGiac(3, 4, 5);
//            TamGiac t2 = new TamGiacCan(3, 5);
//            TamGiacCan t3 = new TamGiacDeu(3);
//
//            System.out.println(t1);
//            System.out.println(t2);
//            System.out.println(t3);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
        // Bai 03
//        SanPham s1 = new Sach("Hihi", 20.5, 80);
//        SanPham s2 = new Sach("OU", 200, 120);
//        SanPham s3 = new BangDia("OOP", 80, 120);
//        
//        QuanLyDSSanPham ds = new QuanLyDSSanPham();
//        ds.nhapDS(s1, s2, s3);
//        ds.nhapDS("com.nhuquynh.demoth3.Sach");
//        System.out.println("===");
//        ds.nhapDS("com.nhuquynh.demoth3.BangDia");
//        System.out.println("===");
//        ds.hienThi();
//        
//        System.out.println("===");
//        System.out.println(ds.timKiem(1));
//        
//        System.out.println("===");
//        ds.timKiem("O").forEach(x -> System.out.println(x));
//        
//        System.out.println("===");
//        ds.timKiem("com.nhuquynh.demoth3.Sach").forEach(x -> System.out.println(x));
//        
//        System.out.println("===");
//        ds.sapXep2TC();
//        ds.hienThi();
//        
//        ds.xoaSP(s1);
//        ds.hienThi();
//        ds.timKiem(50, 150).forEach(x -> System.out.println(x));
//        ds.capNhat(1);
//        ds.hienThi();
        // bai 04
//        TaiKhoan t1 = new TaiKhoan("DORIS", 200, "21/10/2024");
//        TaiKhoan t2 = new TaiKhoanKyHan("HO QUYNH", 100, "08/12/2024", KyHan.MOT_TUAN);
//        TaiKhoan t3 = new TaiKhoan("NHU QUYNH HO PHAM", 250, "10/08/2024");
//        TaiKhoan t4 = new TaiKhoanKyHan("ALANA", 260, "15/11/2024", KyHan.MOT_THANG);
//        TaiKhoan t5 = new TaiKhoanKyHan("AlATIS", 260, "31/08/2024", KyHan.MOT_NAM);
//        QuanLyTaiKhoan tks = new QuanLyTaiKhoan();
//        tks.themDS(t1, t2, t3, t4, t5);
//        tks.hienThi();
//
//        System.out.println("=== Ket qua tra cuu ===");
//        System.out.println(tks.traCuu("000002", "HO QUYNH"));
//
//        System.out.println("=== Hoat dong tai khoan ===");
//        t1.napTien(200.0);
//        t2.napTien(100.0);
//        t3.rutTien(50.0);
//        t4.rutTien(60.0);
//        System.out.println();
//        tks.hienThi();
//
//        System.out.println("=== Tinh toan lai suat + cap nhat ngay dao han ===");
//        tks.tinhLaiSuatTaiKhoan();
//        tks.capNhatNgayDaoHanChoTaiKhoan();
//        tks.hienThi();
        // bai 05
        NhanVien n1 = new NhanVienA("NVA", "Long An", 26, "123456789");
        NhanVien n2 = new NhanVienB("NVB", "HCM", 30, "123456780");
        NhanVien n3 = new NhanVienC("NVC", "An Giang", 24, "123456781");
        NhanVien n4 = new NhanVienC("NVD", "Kien Giang", 22, "123456782");
        NhanVien n5 = new NhanVienC("NVE", "Ha Noi", 22, "123456783");
        NhanVien n6 = new NhanVienC("NVF", "Ha Giang", 22, "123456784");

        QuanLyNhanVien ql = new QuanLyNhanVien();
        ql.themDS(n1, n2, n3, n4, n5, n6);
        ql.hienThi();
        System.out.println("======================");
        ql.xoaNV(6);
        ql.hienThi();
        System.out.println("======= Tra cuu ===========");
        ql.traCuu("123456789").forEach(x -> System.out.println(x));
        ql.traCuu("NVB").forEach(x -> System.out.println(x));
        ql.traCuu("An Giang").forEach(x -> System.out.println(x));

        System.out.println("========= Them nhan vien bo phan D ==============");
        NhanVien n7 = new NhanVienD("HTK", "Dong Nai", 20, "0942817725", 1000000);
        ql.themNV(n7);
        ql.hienThi();

    }
}
