package demo.grid.spreadsheet_functionalities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Month {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("MMM");
	private static final Random random = new Random(System.currentTimeMillis());
	
	private final String name;
	private final Calendar calendar;
	private final String monthlyData[];
	private final Quarter quarter;
	
	public Month(Quarter quarter, int month) {
		this.quarter = quarter;
		
		calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, month);
		
		name = sdf.format(calendar.getTime());
		
		monthlyData = new String[getNumberOfDays()];
		for(int i=0; i<monthlyData.length; i++) {
			int data = random.nextInt(10) == 5 ? 0 - random.nextInt(65536) : random.nextInt(65536);
			monthlyData[i] = Integer.toString(data);
		}
	}
	
	public int getNumberOfDays() {
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getDays() {
		return monthlyData;
	}
	
	public Quarter getQuarter() {
		return this.quarter;
	}
	
	public boolean isFirstMonthOfTheQuarter() {
		return (calendar.get(Calendar.MONTH) % 3) == 0;
	}
	
	public boolean isFirstMonthOfTheYear() {
		return calendar.get(Calendar.MONTH) == Calendar.JANUARY;
	}
}
