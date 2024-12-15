/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class NhanVienD extends NhanVien {

    private double phuCap;

    public NhanVienD(String ten, String quequan, int soNgayCong, String cnmn, double phuCap) {
        super(ten, quequan, soNgayCong, cnmn);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuong() {
        return NhanVien.getLuong() * this.getSoNgayCong() + this.phuCap;
    }

    @Override
    public double layHeSo() {
        return 0;
    }

    @Override
    public String extra() {
        return "D";
    }

    @Override
    public String toString() {
        return String.format("%s Phu cap: %s\n", super.toString(), CauHinh.df.format(this.phuCap));
    }

}
