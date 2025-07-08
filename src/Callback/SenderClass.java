package Callback;

public class SenderClass {
	CallbackInterface callbackObj = null;
	
	public void setCallback(CallbackInterface callback){
		callbackObj = callback;
	}
	
	public void start(){
		callbackObj.editInt(1);
		callbackObj.editString("Hallo");
	}
}
