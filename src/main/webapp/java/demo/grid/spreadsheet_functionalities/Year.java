package demo.grid.spreadsheet_functionalities;

import java.util.ArrayList;
import java.util.List;

public class Year {
	
	private final List<Quarter> quarters = new ArrayList<Quarter>();
	private final int year;
	private final String name;
	
	public Year(int year) {
		this.year = year;
		name = Integer.toString(year);
		
		quarters.add(new Quarter(Year.this, 1));
		quarters.add(new Quarter(Year.this, 2));
		quarters.add(new Quarter(Year.this, 3));
		quarters.add(new Quarter(Year.this, 4));
	}
	
	public List<Quarter> getQuarters() {
		return quarters;
	}
	
	public String getName() {
		return name;
	}
}
