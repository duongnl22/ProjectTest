package untils;

import java.util.Properties;
import models.Diem;
import models.LopHo;
import models.SinhVien;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName =FPL_DAOTAO");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "123456");
        properties.put(Environment.SHOW_SQL, "true");
        //gen DB tu dong
//        properties.put(Environment.HBM2DDL_AUTO, "create");

        conf.setProperties(properties);
        conf.addAnnotatedClass(Diem.class);
        conf.addAnnotatedClass(SinhVien.class);
        conf.addAnnotatedClass(LopHo.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }

}
