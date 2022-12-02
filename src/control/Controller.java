package control;

import view.*;
import model.*;

import data.*;

public class Controller {
	
	//specifications
	private Console myConsole;
    private QuizGame myGame;
    private DAOMySQL myDAO;
	
	
	//implementation
	//constructor
	public Controller() throws Exception {
		/*this.laPartie = DAOStub.getRandomQuizSetForQuizGame();
		this.laConsole = new Console(this);*/
		
		//data interactions
		this.myDAO = new DAOMySQL(this);
		this.myDAO.connectDatabase();
		
		this.myGame = new QuizGame(this);
		
		this.myConsole = new Console(this);
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
}

