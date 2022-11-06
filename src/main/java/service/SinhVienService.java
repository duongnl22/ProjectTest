package service;

import java.util.ArrayList;
import models.SinhVien;
import repository.SinhVienRepository;

public class SinhVienService {

    private SinhVienRepository sinhVienRepository;

    public SinhVienService() {
        sinhVienRepository = new SinhVienRepository();

    }

    public ArrayList<SinhVien> getAll() {
        return sinhVienRepository.getAll();
    }

    public void add(SinhVien sv) {
        sinhVienRepository.add(sv);
    }

    public void update(SinhVien sv) {
        sinhVienRepository.update(sv);
    }

    public void delete(SinhVien sv) {
        sinhVienRepository.delete(sv);
    }

}
