package main.net.spring.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.lang.Exception;
import java.util.ArrayList;

/**
 * Created by thangnguyen on 3/30/15.
 */
@Configuration
@EnableMongoRepositories
//@ComponentScan(basePackages = {MongoDBApp.class})
@PropertySource("classpath:application.properties")
public class MongoDbConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "demo";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo(new ArrayList<ServerAddress>() {{ add(new ServerAddress("127.0.0.1", 27017)); add(new ServerAddress("127.0.0.1", 27027)); add(new ServerAddress("127.0.0.1", 27037)); }});
    }

    @Override
    protected String getMappingBasePackage() {
        return "main.net.spring.model";
    }
}
