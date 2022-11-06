package repository;

import java.util.List;
import javax.persistence.Query;
import models.Diem;
import org.hibernate.Session;
import untils.HibernateUtil;

public class DiemRepository {

    public List<Diem> getAll() {

        Session session = HibernateUtil.getFACTORY().openSession();

        Query query = session.createQuery("FROM Diem");
        List<Diem> listDiem = query.getResultList();

        return listDiem;

    }
}
