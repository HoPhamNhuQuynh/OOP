/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2tt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Tester {

    public static void main(String[] args) throws IOException {
//        // Tạo thư mục chứa câu hỏi
        ThuMucCauHoi thuMucCauHoi = new ThuMucCauHoi("src/main/resources/CauHoi");
//
//        // Thêm một câu hỏi mới
//        String[] p1 = {"Paris", "London", "Berlin", "Madrid"};
//        CauHoi q1 = new CauHoi("What is the capital of France?", p1, "A");
//        thuMucCauHoi.themCH(q1);
//        
//        String[] p2 = {"You", "Your", "Yours", "Youself"};
//        CauHoi q2 = new CauHoi("Take care …, Ann.", p2, "D");
//        thuMucCauHoi.themCH(q2);
//        
//        
//        String[] p3 = {"Careless", "Careful", "Carefully", "Care"};
//        CauHoi q3 = new CauHoi("Be ..., Doris!", p3, "B");
//        thuMucCauHoi.themCH(q3);
//        
//        String[] p4 = {"go", "have gone", "went", "am going"};
//        CauHoi q4 = new CauHoi("I ... to the market with my mom yesterday.", p4, "C");
//        thuMucCauHoi.themCH(q4);

        // Đọc tất cả câu hỏi từ thư mục
        thuMucCauHoi.docCacCauHoi();
        System.out.print("Nhap so luong cau hoi ma ban muon: ");
        int soCauHoi = Integer.parseInt(CauHinh.sc.nextLine());

        // chon ngau nhien so cau hoi tu folder
        List<CauHoi> ql = thuMucCauHoi.chonNN(soCauHoi);
        
        // bai test
        System.out.println("BAT DAU BAI TEST");
        for (var q : ql){
            
        }
        
       
    }
}
