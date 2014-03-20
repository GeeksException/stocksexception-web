package org.geeksexception.stocksexception.web.dao;

import org.geeksexception.pse.stocks.api.model.StockHistorySummary;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MarketSnapshotRepository extends PagingAndSortingRepository<StockHistorySummary, String> {
	
}