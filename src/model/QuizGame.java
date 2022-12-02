package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import control.Controller;

public class QuizGame {
    
	//specifications
	private String playerName;
    private int playerScore;
    private ArrayList<Question> myQuestions;
    private Controller myController;

    //implementation
    public QuizGame(Controller aController) {
    	this.myController = aController;
    	this.playerScore = 0;
    	this.myQuestions = new ArrayList<Question>();
    	
    	for (int i=0; i < 4; i++) {
    		int randomNumber = new Random().nextInt(26);
    		
    		this.myQuestions.add(findQuestion(randomNumber));
    	}
    }

    public QuizGame(String playerNameParam, int i, ArrayList<Question> questions) {
		// TODO Auto-generated constructor stub
	}

	public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public ArrayList<Question> getQuestions() {
        return myQuestions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.myQuestions = questions;
    }

    public void addPlayerScore(int playerScore) {
        this.playerScore += playerScore;
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
    
    public Question findQuestion(int randomNumber) {
		Question aQuestion = null;
		ResultSet rs;
		try {
			rs = myController.getMyDAO().getStmt().executeQuery("SELECT * FROM quiz_db.question WHERE id_question = " + randomNumber);
			if (rs.next()) {
				int id = rs.getInt("id_question");
				String desc = rs.getString("desc_question");
				ArrayList<Answer> answers = getAnswers(id);
				
				aQuestion = new Question(id, desc, answers);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aQuestion;
	}
    
    private ArrayList<Answer> getAnswers(int id) {
		ArrayList<Answer> Answers = new ArrayList<Answer>();
		ResultSet rs;
		try {
			rs = myController.getMyDAO().getStmt().executeQuery("SELECT * FROM quiz_db.answer WHERE id_question = " + id);
			while (rs.next()) {
				String code = rs.getString("id_question");
				String desc = rs.getString("desc_answer");
				boolean correct = rs.getBoolean("is_correct");

				Answers.add(new Answer(code, desc, correct));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Answers;
	}
}
