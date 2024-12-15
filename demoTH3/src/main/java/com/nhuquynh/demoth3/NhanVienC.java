/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author DELL
 */
public class NhanVienC extends NhanVien {

    public NhanVienC(String ten, String quequan, int soNgayCong, String cnmn) {
        super(ten, quequan, soNgayCong, cnmn);
    }

    @Override
    public double layHeSo() {
        return 2.5;
    }

    @Override
    public String extra() {
        return "C";
    }

}
