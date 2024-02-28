package demo.PieChartComposer;
public class PieChartComposer extends SelectorComposer<Div> {
	@Wire
	Charts chart;

	public void doAfterCompose(Div comp) throws Exception {
		super.doAfterCompose(comp);
		PieModel model = new DefaultPieModel();
		model.setValue("C/C++", new Double(12.5));
		model.setValue("Java", new Double(50.2));
		model.setValue("VB", new Double(20.5));
		model.setValue("PHP", new Double(15.5));
		
		chart.setModel(model);
    }
}