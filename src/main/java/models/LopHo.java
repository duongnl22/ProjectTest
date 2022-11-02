package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "lop_hoc")
@Entity
public class LopHo implements Serializable {

    @Id
    @Column(name = "ma_lop")
    private String maLop;
    
    
    @Column(name = "ten_lop")
    private String tenLop;
    
    @Column(name = "ma_SV")
    private String maSV;
    
    @OneToMany(mappedBy = "lopHoc" , fetch = FetchType.LAZY)
    private List<SinhVien> listSV;

    public LopHo() {
    }

    public LopHo(String maLop, String tenLop, String maSV, List<SinhVien> listSV) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maSV = maSV;
        this.listSV = listSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public List<SinhVien> getListSV() {
        return listSV;
    }

    public void setListSV(List<SinhVien> listSV) {
        this.listSV = listSV;
    }
   
    
    
    

}
