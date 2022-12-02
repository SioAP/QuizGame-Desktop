package view;

import java.util.Scanner;

import model.Answer;
import model.Question;

import control.*;

public class Console {

	//specification
	Controller monController;
	
	//implementation
	
    public Console(Controller unController) {
		
    	this.monController = unController;
    	
    	Scanner myScanner = new Scanner(System.in);
	    System.out.println("What's you're name?");
	    String playerName = myScanner.nextLine();
	    System.out.println("Welcome to QuizzyQuiz, " + playerName + " !");
	    System.out.println("Every right answer will give you 10 points, and you will have 5 questions..");
	    System.out.println("In order to win you'll need 30 points. Good Luck ! ^^");
	    
	    monController.getMyGame().setPlayerName(playerName);

  

	    for (Question question : monController.getMyGame().getQuestions()) // foreach
	    {
	        System.out.println(question.getDescriptionQuestion());
	        int i = 0;
	        for (Answer answer : question.getAnswers()) // foreach
	        {
	        	i++;
	            System.out.println(i + ") " + answer.getDescriptionAnswer());
	        }
	        System.out.println("Choose your answer!");
	        int playerAnswer = myScanner.nextInt();

	        while (!monController.getMyGame().isValidAnswer(playerAnswer)) {
	            System.out.println("Not a valid answer, select a correct option please!");
	            playerAnswer = myScanner.nextInt();
	        }

	        if (monController.getMyGame().isCorrectThisAnswer(playerAnswer, question.getAnswers())) {
	        	monController.getMyGame().addPlayerScore(10);
	            System.out.println("Bravoooo, You got it right ! you accumulate 10 points!");
	        } else {
	            System.out.println("Oops.. wrong answer! Better luck next time ! :)");
	        }
	    }
	    
	    String feedbackMessage = "";
	    
	    if (monController.getMyGame().getPlayerScore() >= 30) {
	        feedbackMessage = "Congratulations !! Your score is " + monController.getMyGame().getPlayerScore() + " points ! You are a champ! :D";
	    } else {
	        feedbackMessage = "I'm afraid your score is " + monController.getMyGame().getPlayerScore() + "points.. You lost the game! Better luck next time ;)";
	    }
	    System.out.println(feedbackMessage);
	}

	public Controller getMonController() {
		return monController;
	}

	public void setMonController(Controller monController) {
		this.monController = monController;
	}

}
