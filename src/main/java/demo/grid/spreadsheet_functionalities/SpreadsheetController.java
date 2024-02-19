package demo.grid.spreadsheet_functionalities;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

public class SpreadsheetController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	
	private final SpreadsheetData sdm = new SpreadsheetData();
	
	public ListModel<Month> getMonths() {
		return new ListModelList<Month>(sdm.getMonths(), true);
	}
	
	public String[] getDays() {
		return new String[31];
	}
}
