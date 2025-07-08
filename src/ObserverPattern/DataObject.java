package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class DataObject {
	String data;
	List<View> views = new ArrayList<View>();
	
	public void addView(View v){
		views.add(v);
	}
	
	public void setData(String d){
		data = d;
		notifyViews();
	}
	
	public void loadData(){
		data = "Data is loaded from file";
		notifyViews();
	}
	
	private void notifyViews(){
		for(View v : views){
			v.update(data);
		}
	}
}
