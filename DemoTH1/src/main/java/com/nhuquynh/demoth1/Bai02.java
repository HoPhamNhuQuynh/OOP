/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n = ");
        int n = sc.nextInt();  // n la so bac va co so he so la n+1
        System.out.println("Nhap vao x = ");
        double x = sc.nextDouble();
        double bt = 0;
        for (int i = 0; i <= n; i++) {
            System.out.printf("Nhap vao he so thu %d= ", i + 1);
            double a = sc.nextDouble();
            bt += a * Math.pow(x, i);
        }
        System.out.printf("Gia tri bieu thuc = %.1f\n", bt);

    }
}
