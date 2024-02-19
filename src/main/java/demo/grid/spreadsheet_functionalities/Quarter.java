package demo.grid.spreadsheet_functionalities;

import java.util.ArrayList;
import java.util.List;

public class Quarter {
	
	private final String name;
	private final List<Month> months = new ArrayList<Month>();
	private final Year year;
	
	public Quarter(Year year, int quarter) {
		this.year = year;
		name = String.format("Q%d", quarter);
		
		int start = (quarter - 1) * 3;
		for(int i=start; i< start+3; i++) {
			months.add(new Month(this, i));
		}
	}
	
	public String getName() {
		return name;
	}
	
	public Year getYear() {
		return year;
	}
	
	public List<Month> getMonths() {
		return months;
	}
	
}
