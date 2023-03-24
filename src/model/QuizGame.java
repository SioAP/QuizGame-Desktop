package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import control.Controller;

public class QuizGame {
    
	//specifications
	private String gameName;
	private String gameStatus;
    private ArrayList<Question> myQuestions;
    private Controller myController;

    //implementation
    public QuizGame(Controller aController) {
    	this.myController = aController;
    	this.myQuestions = new ArrayList<Question>();
    	
    	for (int i=0; i < 4; i++) {
    		int randomNumber = new Random().nextInt(26);
    		
    		this.myQuestions.add(myController.getMyDAO().findQuestion(randomNumber));
    	}
    }

    public QuizGame(String playerNameParam, int i, ArrayList<Question> questions) {
		// TODO Auto-generated constructor stub
	}

    public ArrayList<Question> getQuestions() {
        return myQuestions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.myQuestions = questions;
    }

    
    public Boolean isValidAnswer(int selectedAnswer) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
    	arrList.add(1);
    	arrList.add(2);
    	arrList.add(3);
    	arrList.add(4);
    	for (int nb : arrList) {
    		if(nb == selectedAnswer) {
    			return true;
    		} 
    	} return false;
    }

    public Boolean isCorrectThisAnswer(int selectedCodeAnswer, ArrayList<Answer> answers) {
        // answers.removeIf(answer -> !answer.getCodeAnswer().contains(selectedCodeAnswer));
        if (answers.get(selectedCodeAnswer-1).getIsCorrect()) {
            return true;
        } else {
            return false;
        }
    }
    
   
    
  
}
