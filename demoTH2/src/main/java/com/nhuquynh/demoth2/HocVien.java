/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

import java.time.LocalDate;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class HocVien {

    private static int dem = 0;
    private int ma = ++dem;
    private String ten;
    private LocalDate ngaySinh;
    private double[] diem;

    public HocVien(String ten, LocalDate ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String ten, String ngaySinh) {
        this(ten, LocalDate.parse(ngaySinh, CauHinh.FORMATTER));
    }

    public void hienThi() {
        System.out.printf("%d - %s - %s\n", this.getMa(), this.getTen(), this.getNgaySinh().format(CauHinh.FORMATTER));
        if (this.getDiem() != null) {
            for (var x : this.getDiem()) {
                System.out.printf("%.1f\t", x);
            }
            System.out.println();
        }
    }

    public void nhapDiem1HV() {
        System.out.printf("== Nhap cho %s\n", this.getTen().toUpperCase());
        this.setDiem(new double[CauHinh.SO_MON]);

        for (int i = 0; i < CauHinh.SO_MON; i++) {
            System.out.printf("Mon thu %d = ", i + 1);
            this.getDiem()[i] = Double.parseDouble(CauHinh.sc.nextLine());
        }
    }

    public double tinhTB() {
        if (this.diem != null) {
            return DoubleStream.of(this.diem).average().getAsDouble();
        }
        return 0;
    }

    public boolean isHocBong() {
        if (this.diem != null) {
            for (var x : this.diem) {
                if (x < 5) {
                    return false;
                }
            }
            return this.tinhTB() >= 8;
        }
        return false;
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }

}
