package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "STUDENTS")
@Entity
public class SinhVien implements Serializable {

    @Id
    @Column(name = "masv")
    private String maSV;

    @Column(name = "ho_ten")
    private String tenSV;

    @Column(name = "email")
    private String email;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "gioi_tinh")
    private Boolean gioTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "hinh")
    private String hinh;

    @OneToMany(mappedBy = "sinhVien", fetch = FetchType.LAZY)
    private List<Diem> diem;

    @ManyToOne
    @JoinColumn(name = "ma_SV")
    private LopHo lopHoc;
    
    
    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String email, String sdt, Boolean gioTinh, String diaChi, String hinh, List<Diem> diem, LopHo lopHoc) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.email = email;
        this.sdt = sdt;
        this.gioTinh = gioTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
        this.diem = diem;
        this.lopHoc = lopHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Boolean getGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(Boolean gioTinh) {
        this.gioTinh = gioTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public List<Diem> getDiem() {
        return diem;
    }

    public void setDiem(List<Diem> diem) {
        this.diem = diem;
    }

    public LopHo getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHo lopHoc) {
        this.lopHoc = lopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", email=" + email + ", sdt=" + sdt + ", gioTinh=" + gioTinh + ", diaChi=" + diaChi + ", hinh=" + hinh + ", diem=" + diem + ", lopHoc=" + lopHoc + '}';
    }
    
    
}
