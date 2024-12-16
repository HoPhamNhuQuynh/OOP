/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
}
