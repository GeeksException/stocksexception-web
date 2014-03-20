package org.geeksexception.stocksexception.web.config;

import org.geeksexception.pse.stocks.api.service.StocksService;
import org.geeksexception.stocksexception.web.service.MarketSnapshotService;
import org.geeksexception.stocksexception.web.service.impl.MarketSnapshotServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public MarketSnapshotService marketSnapshotService() {
		return new MarketSnapshotServiceImpl();
	}
	
	@Bean
	public StocksService stocksService() {
		return new StocksService();
	}
	
}