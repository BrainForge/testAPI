package com.testres.rest.mongoRepository;

import com.testres.rest.entity.testMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Anton Afanasyeu on 04.04.16.
 */
@Repository
public interface TestMongoRepository extends MongoRepository<testMongo, String> {

}
