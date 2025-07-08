package Callback;

public class mainProgram {

	public static void main(String[] args) {
		ReceiverClass receiver = new ReceiverClass();
		SenderClass sender = new SenderClass();
		sender.setCallback(receiver);
		sender.start();
	}

}
