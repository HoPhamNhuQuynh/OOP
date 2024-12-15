/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class HinhChuNhat {

    private double chieuDai, chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDT() {
        return this.getChieuDai() * this.getChieuRong();
    }

    public double tinhCV() {
        return (this.getChieuDai() + this.getChieuRong()) * 2;
    }

    @Override
    public String toString() {
        return String.format("Hinh chu nhat \n Chieu dai: %.1f\n Chieu rong: %.1f\n Dien tich = %.1f\n Chu vi = %.1f\n",
                this.getChieuDai(), this.getChieuRong(), this.tinhDT(), this.tinhCV());
    }

    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

}
