/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth1;

//import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai03 {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        // nhap email
//        System.out.print("Nhap vao chuoi email: ");
//        String s = sc.nextLine();
//        String kq = s.substring(0, s.indexOf("@"));
//        System.out.println(kq);

        // nhap ki tu hoa
//        System.out.print("Nhap vao chuoi: ");
//        String s1 = sc.nextLine();
//        int cnt = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (Character.isUpperCase(s1.charAt(i)) == true) {
//                cnt++;
//            }
//        }
//        System.out.printf("So ky tu in hoa = %d", cnt);
//        
        // doc du lieu
//        File f = new File("src/main/resources/data.txt");
//        File fo = new File("src/main/resources/out.txt");
//        try ( Scanner sc = new Scanner(f);
//                PrintWriter w = new PrintWriter(fo)) {
//            String s = sc.nextLine();
//            s = s.replace("{file}", "Tap tin");
//            w.print(s);
//            System.out.println(s);
//        }
//        
        // dem so tu trong cau
        Scanner sc = new Scanner(System.in);
        String s2 = "  JaVa   is SimPle ";
        s2 = s2.trim().replaceAll("[\\s,;]+", " ");
        System.out.println(s2);
        String[] a = s2.split("\\s");
        System.out.println(a.length);

        // tim tu dai nhat
        String max = "";
        for (var a1 : a) {
            if (a1.length() > max.length()) {
                max = a1;
            }
        }
        System.out.println(max);

        // dinh dang viet hoa chu cai dau
        StringBuilder b = new StringBuilder();
        for (var x : a) {
            b.append(x.substring(0, 1).toUpperCase()).append(x.substring(1).toLowerCase()).append(" ");
        }
        System.out.println(b.toString().trim());

    }
}
