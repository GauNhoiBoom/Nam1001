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
public class SanPham {
    public String MaSP;
    public String TenSP;
    public String DonViTinh;
    public Double Gia;

    public SanPham() {
    }

    public SanPham(String MaSP, String TenSP, String DonViTinh, Double Gia) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.DonViTinh = DonViTinh;
        this.Gia = Gia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }
    
    
}
