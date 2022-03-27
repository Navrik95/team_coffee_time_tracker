package teamcoffee.accountant.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import teamcoffee.accountant.dao.TrackingDao;
import teamcoffee.accountant.entity.Tracking;
import teamcoffee.accountant.util.HibernateSessionFactoryUtil;

import java.util.List;

@Repository
public class TrackingDaoImpl implements TrackingDao {

    private final SessionFactory sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();

    @Override
    public Tracking findById(int id) {
        return sessionFactory
                .openSession()
                .get(Tracking.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tracking> findAll() {
        return (List<Tracking>) sessionFactory
                .openSession()
                .createQuery("FROM Tracking ")
                .list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tracking> findByUserChatId(long userChatId) {
        return (List<Tracking>) sessionFactory
                .openSession()
                .createQuery("FROM Tracking WHERE userChatId = :userChatId")
                .setParameter("userChatId", userChatId)
                .list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Tracking> findByUserChatIdAndTimeInterval(long userChatId, long intervalStart, long intervalEnd) {
        return (List<Tracking>) sessionFactory
                .openSession()
                .createQuery("FROM Tracking WHERE userChatId = :userChatId AND endTime >= :intervalStart AND endTime <= :intervalEnd")
                .setParameter("userChatId", userChatId)
                .setParameter("intervalStart", intervalStart)
                .setParameter("intervalEnd", intervalEnd)
                .list();
    }

    @Override
    public void save(Tracking tracking) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(tracking);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Tracking tracking) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(tracking);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Tracking tracking = new Tracking();
        tracking.setId(id);
        session.delete(tracking);
        session.getTransaction().commit();
        session.close();
    }
}
