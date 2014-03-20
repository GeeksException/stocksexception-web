package org.geeksexception.stocksexception.web.config;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

public abstract class AbstractDataConfig extends AbstractMongoConfiguration {
	
	@Override
	protected String getDatabaseName() {
		return "stocksexceptiondb";
	}
	
}