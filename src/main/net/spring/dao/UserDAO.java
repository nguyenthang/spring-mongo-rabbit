package main.net.spring.dao;

import main.net.spring.model.User;

import java.util.List;

/**
 * Created by thangnguyen on 3/29/15.
 */
public interface UserDAO {

    public List<User> list();

    public User get(long id);

    public void saveOrUpdate(User user);

    public void delete(long id);


}
