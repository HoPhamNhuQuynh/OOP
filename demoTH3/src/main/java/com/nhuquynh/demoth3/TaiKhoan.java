/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class TaiKhoan {

    private static int dem;
    private String soTK = String.format("%06d", ++dem);
    private String ten;
    double tien;
    LocalDate ngayTao;
    double laiSuat;

    public TaiKhoan(String ten, double tien, LocalDate ngayTao) {
        this.ten = ten;
        this.tien = tien;
        this.ngayTao = ngayTao;
        this.laiSuat = 0.001;
    }

    public TaiKhoan(String ten, double tien, String ngayTao) {
        this(ten, tien, LocalDate.parse(ngayTao, CauHinh.FORMATTER));
    }

    public String extra() {
        return "Tai khoan khong ky han";
    }

    public void tinhTienLai() {
        this.tien = this.laiSuat * this.tien + this.tien;
    }

    public void napTien(Double soTien) {
        this.tien += soTien;
        System.out.println("Nap tien thanh cong!");
    }

    public void rutTien(Double soTien) {
        if (this.tien - soTien >= 0) {
            this.tien -= soTien;
            System.out.println("Rut tien thanh cong!");
        } else {
            System.out.println("So tien con lai trong tai khoan khong du");
        }
    }

    @Override
    public String toString() {
        return String.format(" So tai khoan: %s\n Ten tai khoan: %s\n So tien trong tai khoan:: %.3f VND\n Ngay tao tai khoan: %s\n Loai tai khoan: %s\n",
                this.getSoTK(), this.getTen(), this.getTien(), this.getNgayTao().format(CauHinh.FORMATTER), this.extra());
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
     * @return the soTK
     */
    public String getSoTK() {
        return soTK;
    }

    /**
     * @param soTK the soTK to set
     */
    public void setSoTK(String soTK) {
        this.soTK = soTK;
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
     * @return the tien
     */
    public double getTien() {
        return tien;
    }

    /**
     * @param tien the tien to set
     */
    public void setTien(double tien) {
        this.tien = tien;
    }

    /**
     * @return the ngayTao
     */
    public LocalDate getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

}
