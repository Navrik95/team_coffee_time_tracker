package teamcoffee.command.dao;

import command_service.entity.Team;
import command_service.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class TeamsDAOImpl implements TeamsDAO {

    @Override
    public Team get(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Team.class, id);
    }

    @Override
    public List<Team> getAll() {
        return (List<Team>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Team").list();
    }

    @Override
    public void create(Team team) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(team);
        tx1.commit();
        session.close();
    }

    @Override
    public void update(Team team) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(team);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Team team) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(team);
        tx1.commit();
        session.close();
    }
}
