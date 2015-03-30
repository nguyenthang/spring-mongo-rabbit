package main.net.spring.dao;

import main.net.spring.model.User;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by thangnguyen on 3/29/15.
 */
public class UserDAOImpl implements UserDAO {

    public UserDAOImpl(SessionFactory sessionFactory) {

    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public void saveOrUpdate(User user) {

    }

    @Override
    public void delete(long id) {

    }
}
