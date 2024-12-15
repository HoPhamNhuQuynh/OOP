/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class BangDia extends SanPham {

    private double doDai;

    public BangDia(String ten, double gia, double doDai) {
        super(ten, gia);
        this.doDai = doDai;
    }

    @Override
    public String toString() {
        return String.format("%sDo dai thoi gian phat: %.1f", super.toString(), this.getDoDai()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void nhap1SP() {
        super.nhap1SP(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhap do dai thoi gian phat cua dia: ");
        this.doDai = Double.parseDouble(CauHinh.sc.nextLine());
    }
    
    

    /**
     * @return the doDai
     */
    public double getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }

    
}
