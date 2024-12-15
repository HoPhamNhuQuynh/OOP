/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class SanPham {

    private static int dem;
    private int ma = ++dem;
    private String ten;
    private double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return String.format("Ma: %d\nTen: %s\nGia: %.1f\n ", this.getMa(), this.getTen(), this.getGia()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void nhap1SP() {
        System.out.println("Nhap ten san pham: ");
        this.ten = CauHinh.sc.nextLine();
        System.out.println("Nhap gia san pham: ");
        this.gia = Double.parseDouble(CauHinh.sc.nextLine());
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
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

}
