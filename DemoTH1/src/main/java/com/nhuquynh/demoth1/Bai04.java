/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai04 {

    public static int[] nhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d] = ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatMang(int[] a) {
        for (var x : a) {
            System.out.printf("%d\t", x);
        }
        System.out.println();
    }

    public static boolean checkPrime(int x) {
        if (x < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int tinhTongNT(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (checkPrime(a[i]) == true) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static void searchpP_N(int[] a) {
        int max = a[0], min = a[0];
        int check = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 && a[i] > max) {
                check++;
                max = a[i];
            }
            if (a[i] < 0 && a[i] < min) {
                check++;
                min = a[i];
            }
        }
        if (check != 0) {
            System.out.printf("So duong lon nhat la %d", max);
            System.out.println("");
            System.out.printf("So am be nhat la %d", min);
        } else {
            System.out.println("*");
        }
    }

    public static int searchPrime(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (checkPrime(a[i]) == true && a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // tinh tong cac so nguyen to trong mang
        int[] a = nhapMang(5);
        xuatMang(a);
//        int sumPrime = tinhTongNT(a);
//        System.out.printf("Tong cac so nguyen to = %d", sumPrime);
        System.out.println("");

        // tim so duong lon nhat va so am be nhat, kh co in *
//        searchpP_N(a);
        //Stream
        System.out.printf("Tong gia tri cac so nguyen to trong mang = %d", IntStream.of(a).filter(x -> checkPrime(x) == true).sum());
        System.out.println();
        System.out.printf("Gia tri duong lon nhat trong mang = %d", IntStream.of(a).filter(x -> x > 0).max().orElse(0));
        System.out.println();
        System.out.printf("Gia tri am nho nhat trong mang = %d", IntStream.of(a).filter(x -> x < 0).min().orElse(0));
        System.out.println();
        System.out.printf("So nguyen to nho nhat trong mang = %d", IntStream.of(a).filter(x -> checkPrime(x)).min().getAsInt());
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao gia tri can tim = ");
        int x = sc.nextInt();
        Arrays.sort(a);
        xuatMang(a);
        System.out.println(Arrays.binarySearch(a, x));
    }
}
