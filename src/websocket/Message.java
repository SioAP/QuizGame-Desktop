package websocket;

import model.User;

public class Message {
	
	public String message;
	
	private int nbSocket;
	private User User;
	
	// Messages Contructors
	
	public Message() {
	
	}
	
	public Message(int i, User user) {
		nbSocket = i;
		User = user;
	}

	// Getter & Setter
	
	public int getNbSocket() {
		return nbSocket;
	}

	public User getUser() {
		return User;
	}
	
}
