/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class HinhVuong extends HinhChuNhat {

    public HinhVuong(double a) {
        super(a, a);
    }

     @Override
    public String toString() {
        return String.format("Hinh vuong \n     Canh: %.1f\n Dien tich = %.1f\n Chu vi = %.1f\n",
                this.getChieuDai(), this.getChieuRong(), this.tinhDT(), this.tinhCV());
    }
    
    
}
