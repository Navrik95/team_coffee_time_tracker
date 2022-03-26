package teamcoffee.accountant.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import teamcoffee.accountant.dao.TaskDao;
import teamcoffee.accountant.entity.Task;
import teamcoffee.accountant.util.HibernateSessionFactoryUtil;

import java.util.List;

@Repository
public class TaskDaoImpl implements TaskDao {

    private final SessionFactory sessionFactory = HibernateSessionFactoryUtil.getSessionFactory();

    @Override
    public Task findById(int id) {
        return sessionFactory
                .openSession()
                .get(Task.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Task> findAll() {
        return (List<Task>) sessionFactory
                .openSession()
                .createQuery("FROM Task")
                .list();
    }

    @Override
    public void save(Task task) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(task);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Task task) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(task);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Task task = new Task();
        task.setId(id);
        session.delete(task);
        session.getTransaction().commit();
        session.close();
    }
}
