/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QuanLyTaiKhoan {

    private List<TaiKhoan> ds = new ArrayList<>();

    public void hienThi() {
        this.getDs().forEach(x -> System.out.println(x));
    }

    public void themDS(TaiKhoan... a) {
        this.getDs().addAll(Arrays.asList(a));
    }

    public void themTK(TaiKhoan t) {
        this.getDs().add(t);
    }

    public void capNhatNgayDaoHanChoTaiKhoan() {
        for (var x : this.getDs()) {
            if (x instanceof TaiKhoanKyHan) {
                ((TaiKhoanKyHan) x).capNhatNgayDaoHan();
            }
        }
        System.out.println("Cap nhat ngay dao han cho tat ca tai khoan thanh cong!");
    }

    public void tinhLaiSuatTaiKhoan() {
        for (var x : this.getDs()) {
            if (x.laiSuat != 0.001) {
                x.tinhTienLai();
            }
        }
        System.out.println("Tinh lai suat cho tat ca tai khoan thanh cong!");
    }

    public TaiKhoan traCuu(String so, String ten) {
        return this.getDs().stream().filter(x -> {
            return (x.getSoTK().equals(so)) && (x.getTen().equals(ten));
        }).findFirst().orElse(null);
    }

    public void capNhatTK(TaiKhoan oldTK, TaiKhoan newTK) {
        int idx = this.getDs().indexOf(oldTK);
        if (idx >= 0) {
            this.getDs().set(idx, newTK);
        } else {
            System.out.println("Khong tim thay tai khoan!");
        }
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }

}
