package ObserverPattern;

public class PieChartView extends View {

	@Override
	public void update(String data) {
		System.out.println("[PieChartView] benachrichtigt!");
	}

}
