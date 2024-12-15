/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
abstract public class NhanVien {

    private static int dem;
    private int ma = ++dem;
    private String ten;
    private String quequan;
    private static double luong = 100000;
    private int soNgayCong;
    private String cnmn;

    public NhanVien(String ten, String quequan, int soNgayCong, String cnmn) {
        this.ten = ten;
        this.quequan = quequan;
        this.soNgayCong = soNgayCong;
        this.cnmn = cnmn;
    }

    public double tinhLuong() {
        return this.layHeSo() * this.getLuong() * this.getSoNgayCong();
    }

    abstract public double layHeSo();

    public String extra() {
        return "";
    }

    @Override
    public String toString() {
        return String.format("\n Ma nhan vien: %d\n Ten nhan vien: %s\n So CMND: %s\n Que quan: %s\n Loai nhan vien: %s\n He so luong: %.1f\n Luong co ban: %s VND\n So ngay cong: %d\n Tien luong: %s VND\n", this.getMa(), this.getTen(), this.getCnmn(), this.getQuequan(), this.extra(), this.layHeSo(), CauHinh.df.format(NhanVien.getLuong()), this.getSoNgayCong(), CauHinh.df.format(this.tinhLuong()));
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
     * @return the quequan
     */
    public String getQuequan() {
        return quequan;
    }

    /**
     * @param quequan the quequan to set
     */
    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    /**
     * @return the luong
     */
    public static double getLuong() {
        return luong;
    }

    /**
     * @param aLuong the luong to set
     */
    public static void setLuong(double aLuong) {
        luong = aLuong;
    }

    /**
     * @return the soNgayCong
     */
    public int getSoNgayCong() {
        return soNgayCong;
    }

    /**
     * @param soNgayCong the soNgayCong to set
     */
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    /**
     * @return the cnmn
     */
    public String getCnmn() {
        return cnmn;
    }

    /**
     * @param cnmn the cnmn to set
     */
    public void setCnmn(String cnmn) {
        this.cnmn = cnmn;
    }

}
