package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import org.hibernate.Session;

import java.util.List;

import static jm.task.core.jdbc.constants.Constants.*;
import static jm.task.core.jdbc.util.Util.getSessionFactory;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {

    }
    @Override
    public void createUsersTable() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.createSQLQuery(CREATE_USER_TABLE).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void dropUsersTable() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.createSQLQuery(DROP_USER_TABLE).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(new User(name, lastName, age));
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public void removeUserById(long id) {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();

        User user = session.get(User.class, id);
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public List<User> getAllUsers() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        List<User> users = session.createQuery(FROM_USER).getResultList();
        session.getTransaction().commit();
        session.close();
        return users;
    }
    @Override
    public void cleanUsersTable() {
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.createSQLQuery(CLEAN_USER_HTABLE).executeUpdate();
        session.getTransaction().commit();
        session.close();
    }
}
