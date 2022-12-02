package com.example.quizgame_android.model;

public class Answer {
	
	//specifications
    private int codeAnswer;
    private String descriptionAnswer;
    private boolean isCorrect;
    
    //implementation
    public Answer(int codeAnswer, String descriptionAnswer, boolean isCorrect) {
        this.codeAnswer = codeAnswer;
        this.descriptionAnswer = descriptionAnswer;
        this.isCorrect = isCorrect;
    }

    public int getCodeAnswer() {
        return codeAnswer;
    }

    public void setCodeAnswer(int codeAnswer) {
        this.codeAnswer = codeAnswer;
    }

    public String getDescriptionAnswer() {
        return descriptionAnswer;
    }

    public void setDescriptionAnswer(String descriptionAnswer) {
        this.descriptionAnswer = descriptionAnswer;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

}
