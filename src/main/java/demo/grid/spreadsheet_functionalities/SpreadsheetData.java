package demo.grid.spreadsheet_functionalities;

import java.util.ArrayList;
import java.util.List;

public class SpreadsheetData {
	
	private final List<Year> years = new ArrayList<Year>();
	

	public SpreadsheetData(){
		years.add(new Year(2011));
	}
	
	public List<Year> getYears() {
		return years;
	}
	
	public List<Month> getMonths() {
		List<Month> allMonths = new ArrayList<Month>();
		
		for(Year yr : getYears()) {
			for(Quarter q : yr.getQuarters()) {
				allMonths.addAll(q.getMonths());
			}
		}
		
		return allMonths;
	}
}
