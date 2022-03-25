package teamcoffee.accountant.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import teamcoffee.accountant.dao.ReportDao;
import teamcoffee.accountant.entity.Report;
import teamcoffee.accountant.util.HibernateSessionFactoryUtil;

import java.util.List;

public class ReportDaoImpl implements ReportDao {

    private final SessionFactory sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();

    @Override
    public Report findById(int id) {
        return sessionFactory
                .openSession()
                .get(Report.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Report> findAll() {
        return (List<Report>) sessionFactory
                .openSession()
                .createQuery("FROM Report ")
                .list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Report> findByUserCharId(long userChatId) {
        return (List<Report>) sessionFactory
                .openSession()
                .createQuery("FROM Report WHERE userChatId = :userChatId")
                .setParameter("userChatId", userChatId)
                .list();
    }

    @Override
    public Report findLastUserReport(long userChatId) {
        return (Report) sessionFactory
                .openSession()
                .createQuery("FROM Report " +
                        "WHERE date = (SELECT MAX(date) FROM Report WHERE userChatId = :userChatId)" +
                        "AND userChatId = :userChatId")
                .setParameter("userChatId", userChatId)
                .list().get(0);
    }

    @Override
    public void save(Report report) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(report);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Report report) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(report);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Report report = new Report();
        report.setId(id);
        session.delete(report);
        session.getTransaction().commit();
        session.close();
    }
}
