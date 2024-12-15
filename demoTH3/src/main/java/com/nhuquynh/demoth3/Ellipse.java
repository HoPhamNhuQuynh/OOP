/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

/**
 *
 * @author admin
 */
public class Ellipse {

    private double bkTrucLon;
    private double bkTrucNho;

    public Ellipse(double bkTrucLon, double bkTrucNho) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    public double tinhDT() {
        return Math.PI * this.getBkTrucLon() * this.getBkTrucNho();
    }

    public double tinhCV() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.bkTrucLon, 2) + Math.pow(this.bkTrucNho, 2)) / 2);
    }

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    @Override
    public String toString() {
        return String.format("Hinh Ellipse \n Dien tich = %.1f \n Chu vi = %.1f", this.tinhDT(), this.tinhCV());
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }

}
