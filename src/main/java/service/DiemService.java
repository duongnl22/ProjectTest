package service;

import java.util.List;
import models.Diem;
import repository.DiemRepository;

public class DiemService {
    private DiemRepository diemRepository;

    public DiemService() {
        diemRepository  =new DiemRepository();
    }
    
    public List<Diem> getAll(){
        return diemRepository.getAll();
    }
    
    
}
