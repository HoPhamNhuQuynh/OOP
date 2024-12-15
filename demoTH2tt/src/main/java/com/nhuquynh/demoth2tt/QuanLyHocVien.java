/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2tt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {

    public List<HocVien> ds = new ArrayList<>();
    
    public void themHV(HocVien... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themHV(String link) throws FileNotFoundException {
        File f = new File(link);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.ds.add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }
    
    public void nhapDiemDs() {
        this.ds.forEach(h -> h.nhapDiem1HV());
    }

    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }
    public HocVien timKiem(int id){
        return this.ds.stream().filter(h->h.getMa()==id).findFirst().get();
    }
    public List<HocVien> timKiem(String kw){
        return this.ds.stream().filter(h->h.getTen().contains(kw)).collect(Collectors.toList());
    }
    public List<HocVien> timKiem(){
        return this.ds.stream().filter(h->h.isHocBong()).collect(Collectors.toList());
    }
//    public List<HocVien> sapXepTB(){
//        return this.ds.stream().sorted((x, y) -> x.soSanh(y)).collect(Collectors.toList());
//    }
    public void sapXep(){
        this.ds.sort((h1, h2) -> {
        double t1 = h1.tinhTB();
        double t2 = h2.tinhTB();
        
        if (t1 > t2)
            return 1;
        else if (t1 < t2)
            return -1;
        else
            return 0;
        });
    }
    public void xuatHB(String link) throws FileNotFoundException{
        List<HocVien> hb = this.timKiem();
        File f = new File(link);
        try (PrintWriter w = new PrintWriter(f)){
            hb.forEach(h -> w.printf("%d - %s - %.2f \n", h.getMa(), h.getTen(), h.tinhTB()));
        }
    }
    public long demNho18(){ // count dung 'long'
        return this.ds.stream().filter(h -> h.isNho18()).count();
    }
    public long demLon24(){ // count dung 'long'
        return this.ds.stream().filter(h -> h.isLon24()).count();
    }
    public long dem18To24(){ // count dung 'long'
        return this.ds.stream().filter(h -> h.is18between24()).count();
    }

    Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
