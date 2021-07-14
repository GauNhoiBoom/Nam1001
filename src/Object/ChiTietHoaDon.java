/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author nam
 */
public class ChiTietHoaDon {
    public String MaHD;
    public String Tensp;
    public double slnhap;
    public double slxuat;
    public double slchuyen;
    public double sltra;
    public double DonGiaBan;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String MaHD, String Tensp, double slnhap, double slxuat, double slchuyen, double sltra, double DonGiaBan) {
        this.MaHD = MaHD;
        this.Tensp = Tensp;
        this.slnhap = slnhap;
        this.slxuat = slxuat;
        this.slchuyen = slchuyen;
        this.sltra = sltra;
        this.DonGiaBan = DonGiaBan;
    }

    public ChiTietHoaDon(String Tensp, double slnhap, double slxuat, double slchuyen, double sltra, double DonGiaBan) {
        this.Tensp = Tensp;
        this.slnhap = slnhap;
        this.slxuat = slxuat;
        this.slchuyen = slchuyen;
        this.sltra = sltra;
        this.DonGiaBan = DonGiaBan;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public double getSlnhap() {
        return slnhap;
    }

    public void setSlnhap(double slnhap) {
        this.slnhap = slnhap;
    }

    public double getSlxuat() {
        return slxuat;
    }

    public void setSlxuat(double slxuat) {
        this.slxuat = slxuat;
    }

    public double getSlchuyen() {
        return slchuyen;
    }

    public void setSlchuyen(double slchuyen) {
        this.slchuyen = slchuyen;
    }

    public double getSltra() {
        return sltra;
    }

    public void setSltra(double sltra) {
        this.sltra = sltra;
    }

    public double getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(double DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }
    
    
}
