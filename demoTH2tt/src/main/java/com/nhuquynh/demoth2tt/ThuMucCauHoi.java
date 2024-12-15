/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2tt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author DELL
 */
public class ThuMucCauHoi {

    public List<CauHoi> ds = new ArrayList<>();
    private final String thuMuc;

    public ThuMucCauHoi(String thuMuc) { // tao thu muc 
        this.thuMuc = thuMuc;
        File folder = new File(thuMuc);
        if (!folder.exists()) //neu chua co folder thi tao moi
        {
            folder.mkdir();
        }
    }

    public void themCH(CauHoi q) throws IOException {
        this.ds.add(q);
        String filename = UUID.randomUUID().toString() + ".txt";

        File file = new File(this.thuMuc + "/" + filename);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(q.toString());
        } catch (IOException e) {
            System.err.println("Khong the luu file cau hoi nay" + e.getMessage());
        }
    }

    public void docCacCauHoi() {
        File folder = new File(this.thuMuc);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("Khong co cau hoi nao can tra loi");
            return;
        }
        for (var file : files){
            try {
                CauHoi q = CauHoi.doc1CH(file.getAbsolutePath());
                this.ds.add(q);
            } catch (FileNotFoundException e) {
                System.out.println("Khong the doc tep " + file.getName());
            }
        }
    }
        
    public List<CauHoi> chonNN(int soLuongCH){
        List<CauHoi> ql = new ArrayList<>(this.ds);
        Collections.shuffle(ql);
        return ql.subList(0,soLuongCH);
        
    }
}
