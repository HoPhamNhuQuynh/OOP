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
public class Bai01 {
    public static void main(String[] args) {
        
        int n = (int) (Math.random()*100);
        
        int doan;
        do{
            Scanner sc = new Scanner(System.in);
        System.out.println("Ban doan con so = ");
        doan = sc.nextInt();
        if(doan > n)
            System.out.println("Ban doan lon hon roi!!!");
        else if(doan < n)
            System.out.println("Ban doan nho hon roi !!!!");
        else
            System.out.println("Ban da doan chinh xac!");
        } while(doan != n);
        
    }
}
