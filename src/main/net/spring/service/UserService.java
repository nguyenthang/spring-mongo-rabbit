package main.net.spring.service;

import main.net.spring.dao.UserDAO;
import main.net.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by thangnguyen on 3/31/15.
 */
@Repository
public class UserService implements UserDAO{

    @Autowired
    private MongoTemplate mongoTemplate;

    public static final String COLLECTION_NAME = "user";

    @Override
    public List<User> list() {
        return mongoTemplate.findAll(User.class, COLLECTION_NAME);
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public void saveOrUpdate(User user) {
        if(!mongoTemplate.collectionExists(User.class)){
            mongoTemplate.createCollection(User.class);
        }

        mongoTemplate.insert(user, COLLECTION_NAME);
    }

    @Override
    public void delete(long id) {
        //mongoTemplate.remove()
    }
}
