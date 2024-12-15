/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author admin
 */
public class TamGiacDeu extends TamGiacCan{
    public TamGiacDeu(double a) throws Exception{
        super(a, a);
    }

    @Override
    public String toString() {
           return String.format("Tam giac deu\n Dien tich = %.1f \n Chu vi = %.1f \n", this.tinhDT(), this.tinhCV());
    }
    
    
}
