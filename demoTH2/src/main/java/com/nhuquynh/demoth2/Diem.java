/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

/**
 *
 * @author admin
 */
public class Diem {

    double hoanh;
    private double tung;

    public Diem(double x, double y) {
        this.hoanh = x;
        this.tung = y;
    }

    public Diem() {
        this.hoanh = 0;
        this.tung = 0;
    }

    /**
     * @return the hoanh
     */
    public double getHoanh() {
        return hoanh;
    }

    /**
     * @param hoanh the hoanh to set
     */
    public void setHoanh(double hoanh) {
        this.hoanh = hoanh;
    }

    /**
     * @return the tung
     */
    public double getTung() {
        return tung;
    }

    /**
     * @param tung the tung to set
     */
    public void setTung(double tung) {
        this.tung = tung;
    }

    public void hienThi() {
        System.out.printf("(%.1f, %.1f)\t", this.hoanh, this.tung);
    }

    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.hoanh - d.hoanh, 2) + Math.pow(this.tung - d.tung, 2));
    }
}
