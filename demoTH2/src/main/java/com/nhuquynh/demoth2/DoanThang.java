/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

/**
 *
 * @author admin
 */
public class DoanThang {

    private Diem d1;
    private Diem d2;

    public DoanThang(Diem x, Diem y) {
        this.d1 = x;
        this.d2 = y;
    }

    /**
     * @return the d1
     */
    public Diem getD1() {
        return d1;
    }

    /**
     * @param d1 the d1 to set
     */
    public void setD1(Diem d1) {
        this.d1 = d1;
    }

    /**
     * @return the d2
     */
    public Diem getD2() {
        return d2;
    }

    /**
     * @param d2 the d2 to set
     */
    public void setD2(Diem d2) {
        this.d2 = d2;
    }

    public void hienThiDT() {
        System.out.printf("[(%.1f, %.1f),(%.1f, %.1f)]", this.d1.getHoanh(), this.d1.getTung(), this.d2.getHoanh(), this.d2.getTung());
    }

    public double tinhDoDaiDT() {
        return this.d1.tinhKhoangCach(this.d2);
    }

    public Diem timTrungDiem() {
        Diem td = new Diem();
        td.setHoanh((this.d1.getHoanh() + this.d2.getHoanh())/2);
        td.setTung((this.d1.getTung() + this.d2.getTung())/2);
        return td;
    }
    public boolean isSongSong(DoanThang dt){
        double b1 = (this.d1.getHoanh()-this.d2.getHoanh())*(dt.getD1().getTung()-dt.getD2().getTung());
        double b2 = (this.d1.getTung()-this.d2.getTung())*(dt.getD1().getHoanh()-dt.getD2().getHoanh());
        return b1 == b2;
    }
}
