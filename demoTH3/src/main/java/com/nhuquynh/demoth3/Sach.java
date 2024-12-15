/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class Sach extends SanPham {

    private int soTrang;

    public Sach(String ten, double gia, int soTrang) {
        super(ten, gia);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format("%sSo trang: %d\n", super.toString(), this.getSoTrang()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void nhap1SP() {
        super.nhap1SP(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhap so trang cua sach: ");
        this.soTrang = Integer.parseInt(CauHinh.sc.nextLine());
    }
    
    

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    
}
