package Callback;

public class ReceiverClass implements CallbackInterface{

	@Override
	public void editInt(int edit) {
		System.out.println("int geändert: "+edit);
	}

	@Override
	public void editString(String edit) {
		System.out.println("String geändert: "+edit);
	}

}
