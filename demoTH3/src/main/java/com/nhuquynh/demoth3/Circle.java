/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author admin
 */
public class Circle extends Ellipse {

    Circle(double bk) {
        super(bk, bk);
    }

    @Override
    public String toString() {
        return String.format("Hinh Circle \n Dien tich = %.1f \n Chu vi = %.1f", this.tinhDT(), this.tinhCV());
    }

}
