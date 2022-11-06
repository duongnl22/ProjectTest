package repository;

import java.util.ArrayList;
import models.SinhVien;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import untils.HibernateUtil;

public class SinhVienRepository {

    public ArrayList<SinhVien> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        ArrayList<SinhVien> listSV = (ArrayList<SinhVien>) session.createCriteria(SinhVien.class).list();

        return listSV;
    }

    public void add(SinhVien sv) {

        Transaction transaction = null;

        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {

        }
    }

    public void update(SinhVien sv) {

        Transaction transaction = null;

        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.update(sv);
            transaction.commit();
        } catch (HibernateException ex) {

        }
    }

    public void delete(SinhVien sv) {

        Transaction transaction = null;

        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            transaction = session.beginTransaction();
            session.delete(sv);
            transaction.commit();
        } catch (HibernateException ex) {

        }
    }

    public static void main(String[] args) {
        Session session = HibernateUtil.getFACTORY().openSession();
        ArrayList<SinhVien> listSV = (ArrayList<SinhVien>) session.createCriteria(SinhVien.class).list();
        
        for (SinhVien sinhVien : listSV) {
            System.out.println(sinhVien.toString());
        }
    }
}
