/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class demo {

    public static void main(String[] args) throws Exception {
        // bai 01
        Diem d1 = new Diem(1, 6);
        Diem d2 = new Diem(4, 1);

        d1.hienThi();
        d2.hienThi();

        double kc = d1.tinhKhoangCach(d2);
        System.out.printf("Khoang cach = %.1f\t", kc);

        // bai 02
        DoanThang dt = new DoanThang(d1, d2);
        dt.hienThiDT();
        System.out.printf("\nDo dai doan thang = %.1f\n", dt.tinhDoDaiDT());
        System.out.print("Trung diem doan thang: ");
        Diem td = dt.timTrungDiem();
        td.hienThi();
        DoanThang dt1 = new DoanThang(new Diem(0, 1), new Diem(1, 0));
        dt1.hienThiDT();
        boolean kq = dt.isSongSong(dt1);
        if (kq) {
            System.out.println("\n2 doan thang nay song song voi nhau!\n");
        } else {
            System.out.println("\n2 doan thang tren khong song song\n");
        }

        //bai 03
        HinhChuNhat h = new HinhChuNhat(d1, d2);
        h.tinhDienTich();
        h.tinhChuVi();

        //bai 04
        DuongTron t = new DuongTron(new Diem(1, 1), 4);
        System.out.printf("Dien tich hinh tron = %.1f", t.tinhDienTich());
        System.out.printf("\nChu vi hinh tron = %.1f\n", t.tinhChuVi());

        DuongTron r = new DuongTron(new Diem(2, 0), 2);

        System.out.printf("Vi tri tuong doi giua dtron va diem = %d", t.viTriTuongDoiDiem(d1));
        System.out.printf("\nVi tri tuong doi giua dtron va dtron = %d", t.viTriTuongDoiDT(r));
        System.out.println();

        // bai 05
        PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(2, 5);
        System.out.print("Ket qua cac phep tinh: ");
        p1.cong(p2).hienThi();
        p1.tru(p2).hienThi();
        p1.nhan(p2).hienThi();
        p1.chia(p2).hienThi();
        System.out.println();

        PhanSo p3 = new PhanSo(3, 5).rutGon();
        PhanSo p4 = new PhanSo(5, 9).rutGon();
        PhanSo p5 = new PhanSo(4, 7).rutGon();
        PhanSo p6 = new PhanSo(3, 8).rutGon();
        PhanSo p7 = new PhanSo(2, 3).rutGon();
        PhanSo p8 = new PhanSo(4, 2).rutGon();

        PhanSo[] ds = {p1, p2, p3, p4, p5, p6, p7, p8};
        PhanSo result = new PhanSo();
        System.out.print("Cac ptu:   ");
        for (var x : ds) {
            x.hienThi();
            result = result.cong(x);
        }

        System.out.print("\n Tong cac phan so trong mang = ");
        result.hienThi();

        System.out.print("\nPhan so lon nhat trong mang = ");
        PhanSo max = Arrays.stream(ds).max((x, y) -> x.soSanh(y)).orElse(null);
        max.hienThi();
    }

}
