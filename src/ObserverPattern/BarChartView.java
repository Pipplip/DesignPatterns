package ObserverPattern;

public class BarChartView extends View {

	@Override
	public void update(String data) {
		System.out.println("[BarChartView] benachrichtigt!");
	}

}
