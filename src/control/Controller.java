package control;

import com.esotericsoftware.kryonet.Connection;

import data.DAOMySQL;
import model.QuizGame;
import model.User;
import view.Connexion;
import websocket.ClientWebsocket;
import websocket.Message;

public class Controller {
	
	//specifications
	//private Console myConsole;
    private QuizGame myGame;
    private DAOMySQL myDAO;
    private ClientWebsocket myClient;
    private User myUser;
    private Connexion myConsole;
	
	
	//implementation
	//constructor
	public Controller() throws Exception {
		/*this.laPartie = DAOStub.getRandomQuizSetForQuizGame();
		this.laConsole = new Console(this);*/
		
		//data interactions
		this.myDAO = new DAOMySQL(this);
	//	this.myDAO.connectDatabase();
		
	//	this.myClient = new ClientWebsocket(this);
	//	this.myClient.startClient();
		
	//	this.myGame = new QuizGame(this);
		
	this.myConsole = new Connexion(this);
	this.myConsole.setVisible(true);
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

	public Connexion getMyConsole() {
		return myConsole;
	}

	public void setMyConsole(Connexion myConsole) {
		this.myConsole = myConsole;
	}

	public void setMyClient(ClientWebsocket myClient) {
		this.myClient = myClient;
	}

	public void setMyUser(User myUser) {
		this.myUser = myUser;
	}
	
	
}

