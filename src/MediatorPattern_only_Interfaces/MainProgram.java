package MediatorPattern_only_Interfaces;

public class MainProgram {

	public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();
        
        User user1 = new ChatUser("User1", chatMediator);
        User user2 = new ChatUser("User2", chatMediator);
        User user3 = new ChatUser("User3", chatMediator);
        
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, User1!");
        user3.sendMessage("Hey there!");
	}

}
