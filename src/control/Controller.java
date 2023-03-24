package control;

import view.*;
import websocket.*;
import model.*;

import com.esotericsoftware.kryonet.Connection;

import data.*;

public class Controller {
	
	//specifications
	//private Console myConsole;
    private QuizGame myGame;
    private DAOMySQL myDAO;
    private ClientWebsocket myClient;
    private User myUser;
	
	
	//implementation
	//constructor
	public Controller() throws Exception {
		/*this.laPartie = DAOStub.getRandomQuizSetForQuizGame();
		this.laConsole = new Console(this);*/
		
		//data interactions
		this.myDAO = new DAOMySQL(this);
	//	this.myDAO.connectDatabase();
		
		//this.myClient = new ClientWebsocket(this);
		//this.myClient.startClient();
		this.myGame = new QuizGame(this);
		
		//this.myConsole = new Console(this);
	}
	
	public void selectOption(Message packet, Connection c) throws Exception {
		if(packet.getNbSocket() == 1) {	this.checkRegister(packet, c); }
	}

	private void checkRegister(Message packet, Connection c) {
		myUser = packet.getUser();
		if(packet.getBool()) {
			myUser.setConnected(true);
		} else {
			myUser.setConnected(false);
		}
	}

	public ClientWebsocket getMyClient() {
		return myClient;
	}

	public QuizGame getMyGame() {
		return myGame;
	}

	public void setMyGame(QuizGame theGame) {
		this.myGame = theGame;
	}

	public DAOMySQL getMyDAO() {
		return myDAO;
	}

	public void setMyDAO(DAOMySQL myDAO) {
		this.myDAO = myDAO;
	}

	public User getMyUser() {
		return myUser;
	}
}

