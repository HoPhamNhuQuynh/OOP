/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author admin
 */
public class TamGiacCan extends TamGiac {
    public TamGiacCan(double a, double b) throws Exception{
        super(a, a, b);
    }

    @Override
    public String toString() {
          return String.format("Tam giac can\n Dien tich = %.1f \n Chu vi = %.1f \n", this.tinhDT(), this.tinhCV());
    }
    
    
}
