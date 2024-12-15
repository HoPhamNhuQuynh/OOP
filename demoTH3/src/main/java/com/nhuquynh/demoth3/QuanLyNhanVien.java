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
public class QuanLyNhanVien {
    
    private List<NhanVien> qlnv = new ArrayList<>();
    
    public void themDS(NhanVien... a) {
        this.qlnv.addAll(Arrays.asList(a));
    }
    
    public void hienThi() {
        this.qlnv.forEach(x -> System.out.println(x));
    }
    
    public void themNV(NhanVien n) {
        this.qlnv.add(n);
    }
    
    public void xoaNV(int ma) {
        this.qlnv.removeIf(x -> x.getMa() == ma);
    }
    
    public List<NhanVien> traCuu(String s) {
        List<NhanVien> dsTen = this.qlnv.stream().filter(x -> {
            return x.getTen().equalsIgnoreCase(s);
        }).collect(Collectors.toList());
        
        if (!dsTen.isEmpty()) {
            return dsTen;
        }
        List<NhanVien> dsQue = this.qlnv.stream().filter(x -> {
            return x.getQuequan().equalsIgnoreCase(s);
        }).collect(Collectors.toList());
        
        if (!dsQue.isEmpty()) {
            return dsQue;
        }
        return this.qlnv.stream().filter(x -> x.getCnmn().equals(s)).collect(Collectors.toList());
        
    }
}
