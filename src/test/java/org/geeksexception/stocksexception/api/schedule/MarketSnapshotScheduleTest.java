package org.geeksexception.stocksexception.api.schedule;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;
import org.springframework.scheduling.support.CronSequenceGenerator;

public class MarketSnapshotScheduleTest {
	
	@Test
	public void testCaptureMarketSnapshotCronExpression() throws ParseException {
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		// 9:30 PM to 11:59 AM
		assertEquals(df.parse("11-20-2013 09:30:00"), new CronSequenceGenerator("0 30/1 9-11 ? * MON-FRI").next(df.parse("11-20-2013 09:29:00")));
		assertEquals(df.parse("11-20-2013 09:31:00"), new CronSequenceGenerator("0 30/1 9-11 ? * MON-FRI").next(df.parse("11-20-2013 09:30:00")));
		assertEquals(df.parse("11-20-2013 11:59:00"), new CronSequenceGenerator("0 30/1 9-11 ? * MON-FRI").next(df.parse("11-20-2013 11:58:00")));
		assertEquals(df.parse("11-21-2013 09:30:00"), new CronSequenceGenerator("0 30/1 9-11 ? * MON-FRI").next(df.parse("11-20-2013 11:59:00")));
		
		// 12:00 PM to 12:30 PM
		assertEquals(df.parse("11-20-2013 12:00:00"), new CronSequenceGenerator("0 0-30/1 12 ? * MON-FRI").next(df.parse("11-20-2013 11:59:00")));
		assertEquals(df.parse("11-20-2013 12:01:00"), new CronSequenceGenerator("0 0-30/1 12 ? * MON-FRI").next(df.parse("11-20-2013 12:00:00")));
		assertEquals(df.parse("11-20-2013 12:30:00"), new CronSequenceGenerator("0 0-30/1 12 ? * MON-FRI").next(df.parse("11-20-2013 12:29:00")));
		assertEquals(df.parse("11-21-2013 12:00:00"), new CronSequenceGenerator("0 0-30/1 12 ? * MON-FRI").next(df.parse("11-20-2013 12:30:00")));
		
		// 1:30 PM to 2:59 PM
		assertEquals(df.parse("11-20-2013 13:30:00"), new CronSequenceGenerator("0 30/1 13-14 ? * MON-FRI").next(df.parse("11-20-2013 13:29:00")));
		assertEquals(df.parse("11-20-2013 13:31:00"), new CronSequenceGenerator("0 30/1 13-14 ? * MON-FRI").next(df.parse("11-20-2013 13:30:00")));
		assertEquals(df.parse("11-20-2013 14:59:00"), new CronSequenceGenerator("0 30/1 13-14 ? * MON-FRI").next(df.parse("11-20-2013 14:58:00")));
		assertEquals(df.parse("11-21-2013 13:30:00"), new CronSequenceGenerator("0 30/1 13-14 ? * MON-FRI").next(df.parse("11-20-2013 14:59:00")));
		
		// 3:00 PM to 3:30 PM
		assertEquals(df.parse("11-20-2013 15:00:00"), new CronSequenceGenerator("0 0-30/1 15 ? * MON-FRI").next(df.parse("11-20-2013 14:59:00")));
		assertEquals(df.parse("11-20-2013 15:01:00"), new CronSequenceGenerator("0 0-30/1 15 ? * MON-FRI").next(df.parse("11-20-2013 15:00:00")));
		assertEquals(df.parse("11-20-2013 15:30:00"), new CronSequenceGenerator("0 0-30/1 15 ? * MON-FRI").next(df.parse("11-20-2013 15:29:00")));
		assertEquals(df.parse("11-21-2013 15:00:00"), new CronSequenceGenerator("0 0-30/1 15 ? * MON-FRI").next(df.parse("11-20-2013 15:30:00")));
		
	}
	
}