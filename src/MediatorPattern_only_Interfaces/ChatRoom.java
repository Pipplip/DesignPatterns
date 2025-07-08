package MediatorPattern_only_Interfaces;

import java.util.ArrayList;
import java.util.List;


public class ChatRoom implements ChatMediator{
	
    private List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        // Broadcast the message to all users except the sender
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
