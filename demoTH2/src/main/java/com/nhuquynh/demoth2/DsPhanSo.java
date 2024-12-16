/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DsPhanSo {

    public List<PhanSo> ds = new ArrayList<>();

    public void themPS(PhanSo p) {
        this.ds.add(p);
    }

    public void themPS(PhanSo... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themPS() {
        PhanSo p = new PhanSo();
        p.them1PS();
        this.ds.add(p);
    }

    public void hienThi() {
        this.ds.forEach(x -> x.hienThi());
    }

    public void xoaPS(PhanSo p) {
        this.ds.removeIf(q -> q.soSanh(p) == 0);
    }

    public void xoaPS(int tu, int mau) {
        PhanSo p = new PhanSo(tu, mau);
        this.xoaPS(p);
    }

    public PhanSo tong() {
        return this.ds.stream().reduce(new PhanSo(), (t, x) -> t.cong(x));
    }
    public PhanSo timMax(){
        return this.ds.stream().max((p1,p2) -> p1.soSanh(p2)).get();
    }
    public PhanSo timMin(){
        return this.ds.stream().max((p1,p2) -> -p1.soSanh(p2)).get();
    }
    public void sapXep(){
        this.ds.sort((p1, p2) -> p1.soSanh(p2));
    }
}
