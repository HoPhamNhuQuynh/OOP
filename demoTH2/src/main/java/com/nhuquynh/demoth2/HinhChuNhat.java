/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth2;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    private Diem topLeft;
    private Diem bottomRight;

    public HinhChuNhat(Diem x, Diem y) throws Exception {
        if (y.getHoanh() >= x.getHoanh()
                && y.getTung() <= x.getTung()) {
            this.topLeft = x;
            this.bottomRight = y;
        } else {
            throw new Exception("Invalid data!");
        }

    }

    public void tinhDienTich() {
        double c1 = this.bottomRight.getHoanh() - this.topLeft.getHoanh();
        double c2 = this.topLeft.getTung() - this.bottomRight.getTung();
        System.out.printf("Dien tich hinh chu nhat = %.1f\n", c1 * c2);
    }

    public void tinhChuVi() {
        double c1 = this.bottomRight.getHoanh() - this.topLeft.getHoanh();
        double c2 = this.topLeft.getTung() - this.bottomRight.getTung();
        System.out.printf("Chu vi hinh chu nhat = %.1f\n", (c1 + c2) * 2);
    }

    /**
     * @return the topLeft
     */
    public Diem getTopLeft() {
        return topLeft;
    }

    /**
     * @param topLeft the topLeft to set
     * @throws java.lang.Exception
     */
    public void setTopLeft(Diem topLeft) throws Exception {
        this.topLeft = topLeft;
    }

    /**
     * @return the bottomRight
     */
    public Diem getBottomRight() {
        return bottomRight;
    }

    /**
     * @param bottomRight the bottomRight to set
     * @throws java.lang.Exception
     */
    public void setBottomRight(Diem bottomRight) throws Exception {
        this.bottomRight = bottomRight;
    }

}
