package Callback;

public class ReceiverClass implements CallbackInterface{

	@Override
	public void editInt(int edit) {
		System.out.println("int ge�ndert: "+edit);
	}

	@Override
	public void editString(String edit) {
		System.out.println("String ge�ndert: "+edit);
	}

}
