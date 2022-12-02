package com.example.quizgame_android.model;

import java.util.ArrayList;

public class Question {
	
	//specifications
    private int id;
    private String descriptionQuestion;
    private ArrayList<Answer> answers;

    //implementation
    public Question(int id, String descriptionQuestion, ArrayList<Answer> answers) {
    	this.id = id;
        this.descriptionQuestion = descriptionQuestion;
        this.answers = answers;
    }

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptionQuestion() {
        return descriptionQuestion;
    }

    public void setDescriptionQuestion(String descriptionQuestion) {
        this.descriptionQuestion = descriptionQuestion;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }
}
