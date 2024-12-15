/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QuanLyDSSanPham {

    public List<SanPham> ds = new ArrayList<>();

    public void nhapDS(SanPham... p) {
        this.ds.addAll(Arrays.asList(p));
    }

    public void nhapDS(String tenLop) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class lop = Class.forName(tenLop);
        SanPham s = (SanPham) lop.getDeclaredConstructor().newInstance();
        s.nhap1SP();
        this.ds.add(s);
    }

    public void xoaSP(int id) {
        this.ds.removeIf(x -> x.getMa() == id);
    }

    public void xoaSP(SanPham p) {
        this.xoaSP(p.getMa());
    }

    public void hienThi() {
        this.ds.forEach(x -> System.out.println(x));
    }

    public List<SanPham> timKiem(String str) {
        try {
            Class c = Class.forName(str);
            return this.ds.stream().filter(x -> c.isInstance(x)).collect(Collectors.toList());
        } catch (ClassNotFoundException e) {
            return this.ds.stream().filter(x -> x.getTen().contains(str)).collect(Collectors.toList());
        }
    }

    public SanPham timKiem(int id) {
        return this.ds.stream().filter(x -> x.getMa() == id).findFirst().get();
    }

    public void capNhat(int id) {
        this.timKiem(id).setTen(CauHinh.sc.nextLine());
        this.timKiem(id).setGia(Double.parseDouble(CauHinh.sc.nextLine()));
    }

    public List<SanPham> timKiem(double min, double max) {
        return this.ds.stream().filter(x -> x.getGia() >= min && x.getGia() <= max).collect(Collectors.toList());
    }
    
    public void sapXep(){
        this.ds.sort((s1, s2) -> Double.compare(s1.getGia(), s2.getGia()));
    }

    public void sapXep2TC() {
        this.ds.sort((s1, s2) -> {
            String t1 = s1.getTen();
            String t2 = s2.getTen();

            if (t1.equalsIgnoreCase(t2)) {
                return -Double.compare(s1.getGia(), s2.getGia());
            }
            return t1.compareToIgnoreCase(t2);
        });
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

}
