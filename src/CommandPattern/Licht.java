package CommandPattern;

public class Licht {

	String location = "";

	public Licht(String location) {
		this.location = location;
	}

	public void an() {
		System.out.println(location + " Licht ist an");
	}

	public void aus() {
		System.out.println(location + " Licht ist aus");
	}
}
