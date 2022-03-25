package teamcoffee.accountant.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import teamcoffee.accountant.entity.Report;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.entity.Tracking;

public class HibernateSessionFactoryUtil {

    private final static HibernateSessionFactoryUtil instance = new HibernateSessionFactoryUtil();

    private final SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Task.class);
        configuration.addAnnotatedClass(Tracking.class);
        configuration.addAnnotatedClass(Report.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory(){
       return instance.sessionFactory;
    }
}
