package com.testres.rest.config;

import com.mongodb.Mongo;
import com.mongodb.MongoURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Anton Afanasyeu on 04.04.16.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.testres.rest.mongoRepository")
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo(new MongoURI("mongodb://127.0.0.1:27017"));
    }
}
