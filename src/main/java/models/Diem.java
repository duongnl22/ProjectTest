package models;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "GRADE")
@Entity
public class Diem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tieng_anh")
    private Double tiengAnh;

    @Column(name = "tin_hoc")
    private Double tinHoc;

    @Column(name = "gdtc")
    private Double gdtc;

    @ManyToOne
    @JoinColumn(name = "masv")
    private SinhVien sinhVien;

    public Diem() {
    }

    public Diem(Integer id, Double tiengAnh, Double tinHoc, Double gdtc, SinhVien sinhVien) {
        this.id = id;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.gdtc = gdtc;
        this.sinhVien = sinhVien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(Double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public Double getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(Double tinHoc) {
        this.tinHoc = tinHoc;
    }

    public Double getGdtc() {
        return gdtc;
    }

    public void setGdtc(Double gdtc) {
        this.gdtc = gdtc;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "Diem{" + "id=" + id + ", tiengAnh=" + tiengAnh + ", tinHoc=" + tinHoc + ", gdtc=" + gdtc + ", sinhVien=" + sinhVien + '}';
    }

}
