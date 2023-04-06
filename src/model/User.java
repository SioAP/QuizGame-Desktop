package model;

import java.sql.*;

import control.Controller;

public class User {

	private String name;
    private String pass;
    private int score;
	private Controller myController;

    public User() {
    	
    }

    public User(Controller aController) {
    	this.myController = aController;
    }
    
    public boolean createUser(String name, String pass) throws Exception {
    	boolean exist = checkExist(name, pass);
    	//System.out.println("Exist :" + exist);
    	if(!exist) {
    		myController.getMyDAO().getStmt().execute("INSERT INTO quiz_db.user (username, password) VALUES ('" + name + "', '" + pass + "')");
        	return true;
    	} else {
    		return false;
    	}		
    }

	public boolean connectUser(String name, String pass) throws Exception {
		ResultSet rs;
    	rs = myController.getMyDAO().getStmt().executeQuery("SELECT * FROM quiz_db.user WHERE username = '" + name + "' AND password = '" + pass + "'");
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}
    
    private boolean checkExist(String name, String pass) throws Exception {
    	ResultSet rs;
    	rs = myController.getMyDAO().getStmt().executeQuery("SELECT * FROM quiz_db.user WHERE username = '" + name + "'");
    	if (rs.next()) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    // Getters & Setters

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public int getScore() {
        return score;
    }

    public void addScoreUser(int aScore) {
        this.score += aScore;
    }
}
