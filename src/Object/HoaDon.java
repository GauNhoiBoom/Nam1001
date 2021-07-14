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
public class HoaDon {
    public String MaHD;
    public String MaNVLap;
    public String LoaiHD;
    public String NgayLap;
    public String NgayNhan;
    public String DienGiai;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String MaNVLap, String LoaiHD, String NgayLap, String NgayNhan, String DienGiai) {
        this.MaHD = MaHD;
        this.MaNVLap = MaNVLap;
        this.LoaiHD = LoaiHD;
        this.NgayLap = NgayLap;
        this.NgayNhan = NgayNhan;
        this.DienGiai = DienGiai;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNVLap() {
        return MaNVLap;
    }

    public void setMaNVLap(String MaNVLap) {
        this.MaNVLap = MaNVLap;
    }

    public String getLoaiHD() {
        return LoaiHD;
    }

    public void setLoaiHD(String LoaiHD) {
        this.LoaiHD = LoaiHD;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(String NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public String getDienGiai() {
        return DienGiai;
    }

    public void setDienGiai(String DienGiai) {
        this.DienGiai = DienGiai;
    }
    
    
}
