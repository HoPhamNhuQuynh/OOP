/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhuquynh.demoth3;

import static com.nhuquynh.demoth3.KyHan.MOT_NAM;
import static com.nhuquynh.demoth3.KyHan.MOT_THANG;
import static com.nhuquynh.demoth3.KyHan.MOT_TUAN;
import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author DELL
 */
enum KyHan {
    MOT_TUAN,
    MOT_THANG,
    MOT_NAM
}

public class TaiKhoanKyHan extends TaiKhoan {

    private static final Map<KyHan, Integer> KyHanToSoNgay = Map.of(
            KyHan.MOT_TUAN, 7,
            KyHan.MOT_THANG, 30,
            KyHan.MOT_NAM, 365
    );

    private KyHan thongTinKyHan;
    private LocalDate ngayDaoHan;
    private boolean daTatToan = false;

    public TaiKhoanKyHan(String ten, double tien, LocalDate ngayTao, KyHan thongTinKyHan) {
        super(ten, tien, ngayTao);
        this.thongTinKyHan = thongTinKyHan;
        this.ngayDaoHan = this.ngayTao.plusDays(KyHanToSoNgay.get(this.thongTinKyHan));
    }

    public TaiKhoanKyHan(String ten, double tien, String ngayTao, KyHan thongTinKyHan) {
        super(ten, tien, ngayTao);
        this.thongTinKyHan = thongTinKyHan;
        this.ngayDaoHan = this.ngayTao.plusDays(KyHanToSoNgay.get(this.thongTinKyHan));
    }

    @Override
    public void tinhTienLai() {
        if (this.daTatToan) {
            System.out.println("Tai khoan cua ban da tat toan nen khong co lai suat cho ky han nay!");
        } else {
            double laiSuatKyHan = 0;
            switch (thongTinKyHan) {
                case MOT_NAM ->
                    laiSuatKyHan = 0.068;
                case MOT_THANG ->
                    laiSuatKyHan = 0.045;
                case MOT_TUAN ->
                    laiSuatKyHan = 0.005;
            }
            this.tien = this.tien * laiSuatKyHan + this.tien;
        }
    }

    public void capNhatNgayDaoHan() {
        LocalDate ngayHienTai = LocalDate.now();
        if (thongTinKyHan != null){
            switch (thongTinKyHan) {
            case MOT_NAM ->
                this.ngayDaoHan = ngayHienTai.plusYears(1);
            case MOT_THANG ->
                this.ngayDaoHan = ngayHienTai.plusMonths(1);
            case MOT_TUAN ->
                this.ngayDaoHan = ngayHienTai.plusWeeks(1);
        }
        }
    }

    @Override
    public void napTien(Double soTien) {
        if (LocalDate.now().isEqual(this.ngayDaoHan)) {
            super.napTien(soTien);
        } else {
            System.out.println("Khong dung ngay nap tien!");
        }
    }

    @Override
    public void rutTien(Double soTien) {
        if (LocalDate.now().isEqual(this.ngayDaoHan)) {
            this.daTatToan = true;
            this.thongTinKyHan = null;
            this.laiSuat = 0.001;
            super.rutTien(soTien);
            System.out.println("So tien con lai: " + this.tien);
            System.out.println("Tai khoan da tro thanh tat toan!");

        } else {
            System.out.println("Khong dung ngay rut tien!");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String extra() {
        return "Tai khoan co ky han";
    }

    @Override
    public String toString() {
        return String.format("%s Thong tin ky han: %s\n Ngay dao han: %s\n", super.toString(), this.thongTinKyHan, this.ngayDaoHan.format(CauHinh.FORMATTER));
    }

    /**
     * @return the thongTinKyHan
     */
    public KyHan getThongTinKyHan() {
        return thongTinKyHan;
    }

    /**
     * @param thongTinKyHan the thongTinKyHan to set
     */
    public void setThongTinKyHan(KyHan thongTinKyHan) {
        this.thongTinKyHan = thongTinKyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

}
