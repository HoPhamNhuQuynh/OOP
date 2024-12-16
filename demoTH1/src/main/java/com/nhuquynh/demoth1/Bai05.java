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
public class Bai05 {

    public static int[][] mangNN(int r, int c) {
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        return a;
    }

    public static int[][] xuatmangNN(int[][] a) {
        for (var a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.printf("%d\t", a1[j]);
//                System.out.print("\t");
            }
            System.out.print("\n");
        }
        return a;
    }

    public static void main(String[] args) {
        // sinh ngau nhien ma tran 
        int[][] a = mangNN(3, 4);
        xuatmangNN(a);

        // tinh tong tren tung dong va tim chi so dong co tong lon nhat
        int sum;
        int max = Integer.MIN_VALUE, maxPos = 0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            if (sum > max) {
                max = sum;
                maxPos = i;
            }
            System.out.printf("Tong cac gia tri tren dong thu %d = %d", i, sum);
            System.out.println("");
        }
        System.out.printf("Chi so dong co tong lon nhat = %d", maxPos);
        System.out.println("");

        // tinh tong tung cot va tim chi so cot co tong nho nhat
        int min = Integer.MAX_VALUE, minPos = 0;
        for (int i = 0; i < a[0].length; i++) {
            sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j][i];
            }
            if (sum < min) {
                min = sum;
                minPos = i;
            }
            System.out.printf("Tong cac gia tri tren cot thu %d = %d", i, sum);
            System.out.println("");
        }
        System.out.printf("Chi so cot co tong nho nhat = %d", minPos);
        System.out.println("");

        // tinh tong dong d va tim gia tri nho nhat dong d
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao dong muon tinh tong = ");
        int r = sc.nextInt();
        int sumR = 0, minValue = Integer.MAX_VALUE;
        for (int j = 0; j < a[r].length; j++) {
            sumR += a[r][j];
            if(a[r][j] < minValue)
                minValue = a[r][j];
        }
        System.out.printf("Tong cac gia tri tren dong %d = %d", r, sumR);
        System.out.println("");
        System.out.printf("Gia tri nho nhat trong dong = %d", minValue);
        System.out.println("");

        // tinh tong cot c va tim gia tri lon nhat cot c
        System.out.print("Nhap vao cot muon tinh tong = ");
        int c = sc.nextInt();
        int sumC = 0, maxValue = Integer.MIN_VALUE;
        for (int[] a1 : a) {
            sumC += a1[c];
            if(a1[c] > maxValue)
                maxValue = a1[c];
        }
        System.out.printf("Tong cac gia tri tren cot %d = %d", c, sumC);
        System.out.println("");
        System.out.printf("Gia tri lon nhat trong cot = %d", maxValue);
        System.out.println("");
    }
}
