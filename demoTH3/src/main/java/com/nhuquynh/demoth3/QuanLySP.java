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
 * @author admin
 */
public class QuanLySP {

    private List<SanPham> ds = new ArrayList<>();

    public void nhapSP(SanPham... p) {
        this.ds.addAll(Arrays.asList(p));
    }

    public void nhapSP(String tenLop) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName(tenLop);
        SanPham s = (SanPham) c.getDeclaredConstructor().newInstance();
        s.nhap1SP();
        this.ds.add(s);
    }

    public void hienThi() {
        this.ds.forEach(x -> {
            System.out.println(x.getClass());
            System.out.println(x);
        });
    }
    
    public void capNhat(int id){
        this.timkiem(id).setTen(CauHinh.sc.nextLine());
        this.timkiem(id).setGia(Double.parseDouble(CauHinh.sc.nextLine()));
    }

    public SanPham timkiem(int id) {
        return this.ds.stream().filter(x -> x.getMa() == id).findFirst().get();
    }

    public List<SanPham> timkiem(String str) {
        try {
            Class c = Class.forName(str);
            return this.ds.stream().filter(x -> c.isInstance(x)).collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            return this.ds.stream().filter(x -> x.getTen().contains(str)).collect(Collectors.toList());
        }
    }

    public List<SanPham> timkiem(double min, double max) {
        return this.ds.stream().filter(x -> x.getGia() >= min && x.getGia() <= max).collect(Collectors.toList());
    }

    public void sapXep() {
        this.ds.sort((s1, s2) -> Double.compare(s1.getGia(), s2.getGia()));
    }

    public void sapXep2TC() {
        this.ds.sort((s1, s2) -> {
            String t1 = s1.getClass().toString();
            String t2 = s2.getClass().toString();

            if (t1.equals(t2)) {
                return -Double.compare(s1.getGia(), s2.getGia());
            }

            return t1.compareTo(t2);
        });
    }

    public void xoaSP(SanPham p) {
        this.xoaSP(p.getMa());
    }

    public void xoaSP(int maSP) {
        this.ds.removeIf(x -> x.getMa() == maSP);
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
