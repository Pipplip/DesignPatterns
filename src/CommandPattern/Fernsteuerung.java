package CommandPattern;

public class Fernsteuerung {
	Befehl[] anBefehle;
	Befehl[] ausBefehle;
	
	public Fernsteuerung(){
		anBefehle = new Befehl[7];
		ausBefehle = new Befehl[7];
		
		Befehl keinBefehl = new KeinBefehl();
		for(int i = 0; i < 7; i++){
			anBefehle[i] = keinBefehl;
			ausBefehle[i] = keinBefehl;
		}
	}
	
	public void setBefehl(int platz, Befehl anBefehl, Befehl ausBefehl){
		anBefehle[platz] = anBefehl;
		ausBefehle[platz] = ausBefehl;
	}
	
	public void anKnopfWurdeGedrueckt(int platz){
		anBefehle[platz].ausfuehren();
	}
	
	public void ausKnopfWurdeGedrueckt(int platz){
		ausBefehle[platz].ausfuehren();
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\n----Fernsteuerung----\n");
		for(int i = 0; i < anBefehle.length; i++){
			sb.append("[platz "+i+"]" + anBefehle[i].getClass().getName()+"   "
					+ ausBefehle[i].getClass().getName()+ "\n"
					);
		}
		return sb.toString();
	}
	
}
