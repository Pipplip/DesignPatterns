package MediatorPattern;

public class MainProgram {

	public static void main(String[] args) {

		// Mediator = Vermittler
		// vermittelt zwischen Objekten, die sich nicht kennen
		
        // Mediator erstellen
        ChatMediator mediator = new ChatMediatorImpl();

        // Benutzer erstellen
        User user1 = new ConcreteUser(mediator, "Alice");
        User user2 = new ConcreteUser(mediator, "Bob");
        User user3 = new ConcreteUser(mediator, "Charlie");

        // Benutzer zum Mediator hinzufügen
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        // Nachrichten senden
        user1.sendMessage("Hallo, alle!");
        user2.sendMessage("Hi Alice, wie geht's?");
        user3.sendMessage("Guten Morgen zusammen!");
	}

}
