package CommandPattern;

public class LichtAnBefehl implements Befehl{
	Licht licht;
	
	public LichtAnBefehl(Licht licht){
		this.licht = licht;
	}
	
	@Override
	public void ausfuehren() {
		licht.an();
	}
}
