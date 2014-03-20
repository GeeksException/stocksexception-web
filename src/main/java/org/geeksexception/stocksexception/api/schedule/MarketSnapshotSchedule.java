package org.geeksexception.stocksexception.api.schedule;

import javax.inject.Inject;

import org.geeksexception.stocksexception.web.service.MarketSnapshotService;
import org.springframework.scheduling.annotation.Scheduled;

public class MarketSnapshotSchedule {
	
	private @Inject MarketSnapshotService marketSnapshotService;
	
	public MarketSnapshotSchedule() { }
	
	@Scheduled(cron = "0 30/1 9-11 ? * MON-FRI", zone = "Asia/Singapore")
	public void captureMarketSnapshot1() {
		marketSnapshotService.captureMarketSnapshot();
	}
	
	@Scheduled(cron = "0 0-30/1 12 ? * MON-FRI", zone = "Asia/Singapore")
	public void captureMarketSnapshot2() {
		captureMarketSnapshot1();
	}
	
	@Scheduled(cron = "0 30/1 13-14 ? * MON-FRI", zone = "Asia/Singapore")
	public void captureMarketSnapshot3() {
		captureMarketSnapshot1();
	}

	@Scheduled(cron = "0 0-30/1 15 ? * MON-FRI", zone = "Asia/Singapore")
	public void captureMarketSnapshot4() {
		captureMarketSnapshot1();
	}
	
}