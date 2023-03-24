package websocket;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

import control.*;
import model.*;


public class ClientWebsocket extends Listener {

	static Controller myController;
	//Our client object.
	static Client client;
	//IP to connect to.
	static String ip = "localhost";
	//Ports to connect on.
	static int tcpPort = 28000, udpPort = 28000;
	
	//A boolean value.
	static boolean messageReceived = false;
	
	public ClientWebsocket(Controller aController) {
		myController = aController;
	}
	
	public void startClient() throws Exception {
		System.out.println("Connecting to the server...");
		//Create the client.
		client = new Client();
		
		//Register the packet object.
		client.getKryo().register(Message.class);
		client.getKryo().register(User.class);

		//Start the client
		client.start();
		//The client MUST be started before connecting can take place.
		
		//Connect to the server - wait 5000ms before failing.
		client.connect(5000, ip, tcpPort, udpPort);
		
		//Add a listener
		client.addListener(myController.getMyClient());
		
		System.out.println("Connected! The client program is now waiting for a packet...\n");
		
		//This is here to stop the program from closing before we receive a message.
		while(!messageReceived){
			Thread.sleep(1000);
		}
		
		//System.out.println("Client will now exit.");
		//System.exit(0);
	}

	//I'm only going to implement this method from Listener.class because I only need to use this one.
	public void received(Connection c, Object p){

		if(p instanceof Message) {
			Message packet = (Message) p;
			try { myController.selectOption(packet, c); } catch (Exception e) {	e.printStackTrace(); }
		}
	}
	
	public void createUser(String name, String pass) {
		User user = new User(name, pass);
		client.sendTCP(new Message(1, user));
	}
}
