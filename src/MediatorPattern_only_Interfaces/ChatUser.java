package MediatorPattern_only_Interfaces;

public class ChatUser implements User{
    private String name;
    private ChatMediator mediator;
    
    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, (User)this);
    }
    
    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }

}
