/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2tt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class CauHoi {

    private String cauHoi;
    private String[] phuongAn;
    private String dapAn;

    public CauHoi(String cauHoi, String[] phuongAn, String dapAn) {
        this.cauHoi = cauHoi;
        this.phuongAn = phuongAn;
        this.dapAn = dapAn;
    }

    public void hienThi() {
        System.out.printf("Cau hoi: %s \n", this.getCauHoi());
        char ops = 'A';
        for (var x : this.getPhuongAn()) {
            System.out.printf(ops + ". %s\n", x);
            ops++;
        }
        System.out.println();
    }

    public boolean isDapAn(String dapAn) {
        return (this.getDapAn().equalsIgnoreCase(dapAn));
    }

    @Override
    public String toString() { // doi tuong -> chuoi va luu vao thu muc
        StringBuilder builder = new StringBuilder(this.getCauHoi() + "\n");
        for (var op : this.getPhuongAn()) {
            builder.append(op).append("\n");
        }
        builder.append(this.getDapAn());
        return builder.toString();
    }

    public static CauHoi doc1CH(String link) throws FileNotFoundException {
        File f = new File(link); // file -> doi tuong
        try (Scanner sc = new Scanner(f)) {
            String noidung = sc.nextLine();
            String luachon[] = new String[CauHinh.SO_PHUONG_AN];
            for (int i = 0; i < CauHinh.SO_PHUONG_AN; i++) {
                luachon[i] = sc.nextLine();
            }
            String cauTraLoi = sc.nextLine();
            return new CauHoi(noidung, luachon, cauTraLoi);
        }
    }

    /**
     * @return the cauHoi
     */
    public String getCauHoi() {
        return cauHoi;
    }

    /**
     * @param cauHoi the cauHoi to set
     */
    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    /**
     * @return the phuongAn
     */
    public String[] getPhuongAn() {
        return phuongAn;
    }

    /**
     * @param phuongAn the phuongAn to set
     */
    public void setPhuongAn(String[] phuongAn) {
        this.phuongAn = phuongAn;
    }

    /**
     * @return the dapAn
     */
    public String getDapAn() {
        return dapAn;
    }

    /**
     * @param dapAn the dapAn to set
     */
    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

}
