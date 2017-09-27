package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TimeZoneExample {

	public static void main(String[] args) {
		int count = 0;
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			System.out.println("count :"+ count++  + displayTimeZone(TimeZone.getTimeZone(id)));
		}

//		System.out.println("\nTotal TimeZone ID " + ids.length);

	}

	private static Map<String, String> displayTimeZone(TimeZone tz) {

		Map<String, String> map = new HashMap<String, String>();
		
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
                                  - TimeUnit.HOURS.toMinutes(hours);
		// avoid -4:-30 issue
		minutes = Math.abs(minutes);

		String result = "";
		if (hours > 0) {
			map.put(String.format("(GMT+%d:%02d)", hours, minutes), tz.getID());
		} else {
			map.put(String.format("(GMT%d:%02d)", hours, minutes), tz.getID());
		}

		return map;

	}

}
