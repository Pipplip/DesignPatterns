package ObserverPattern;

public class MainProgram {

	public static void main(String[] args) {
		// Observer   : Beobachter (hier: Views)
		// Observable : Erzähler / Beobachtete (hier: DataObject)
		
		BarChartView barChart = new BarChartView();
		PieChartView pieChart = new PieChartView();
		
		DataObject dataObject = new DataObject();
		dataObject.addView(barChart);
		dataObject.addView(pieChart);
		dataObject.setData("some data"); // dataObject macht was und informiert die Observer
		dataObject.loadData(); 			 // dataObject macht was und informiert die Observer
	}

}
