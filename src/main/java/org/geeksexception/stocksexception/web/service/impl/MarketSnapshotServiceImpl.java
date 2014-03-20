package org.geeksexception.stocksexception.web.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.geeksexception.pse.stocks.api.model.StockHistorySummary;
import org.geeksexception.pse.stocks.api.service.StocksService;
import org.geeksexception.stocksexception.web.dao.MarketSnapshotRepository;
import org.geeksexception.stocksexception.web.service.MarketSnapshotService;

public class MarketSnapshotServiceImpl implements MarketSnapshotService {
	
	private @Inject MarketSnapshotRepository marketSnapshotRepository;
	
	private @Inject StocksService stocksService;
	
	public void captureMarketSnapshot() {
		Date date = new Date();
		List<StockHistorySummary> stocks = stocksService.retrieveAllStocks();
		
		for(StockHistorySummary stock : stocks) {
			stock.setDateCreated(date);
			
			marketSnapshotRepository.save(stock);
		}
	}

}