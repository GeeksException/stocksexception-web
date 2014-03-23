package org.geeksexception.stocksexception.web.config;

import org.geeksexception.pse.stocks.api.service.StocksService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public StocksService stocksService() {
		return new StocksService();
	}
	
}