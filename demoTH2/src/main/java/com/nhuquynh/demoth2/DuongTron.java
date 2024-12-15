/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

/**
 *
 * @author admin
 */
public class DuongTron {

    private Diem tam;
    private double banKinh;

    public DuongTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public int viTriTuongDoiDiem(Diem d) {
        double kc = this.tam.tinhKhoangCach(d);
        if (kc > this.banKinh) {
            return 1;
        } else if (kc < this.banKinh) {
            return -1;
        } else {
            return 0;
        }
    }

    public int viTriTuongDoiDT(DuongTron d) {
        double kc = this.tam.tinhKhoangCach(d.tam);
        double t = this.banKinh + d.banKinh;
        if (kc > t) {
            return 1;
        } else if (kc < t) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * @return the tam
     */
    public Diem getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(Diem tam) {
        this.tam = tam;
    }

    /**
     * @return the banKinh
     */
    public double getBanKinh() {
        return banKinh;
    }

    /**
     * @param banKinh the banKinh to set
     */
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

}
