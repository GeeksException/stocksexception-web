package org.geeksexception.stocksexception.web.config;

import org.geeksexception.stocksexception.api.schedule.MarketSnapshotSchedule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ScheduleConfig {
	
	@Bean
	public MarketSnapshotSchedule marketSnapshotSchedule() {
		return new MarketSnapshotSchedule();
	}
	
}