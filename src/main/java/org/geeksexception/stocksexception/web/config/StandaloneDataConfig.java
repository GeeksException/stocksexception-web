package org.geeksexception.stocksexception.web.config;

import org.geeksexception.stocksexception.api.annotation.Development;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories("org.geeksexception.stocksexception.web.dao")
@EnableTransactionManagement
@Development
public class StandaloneDataConfig extends AbstractDataConfig {
	
	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost");
	}
	
}