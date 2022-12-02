package model;

public class Answer {
	
	//specifications
    private String codeAnswer;
    private String descriptionAnswer;
    private boolean isCorrect;
    
    //implementation
    public Answer(String codeAnswer2, String descriptionAnswer, boolean isCorrect) {
        this.codeAnswer = codeAnswer2;
        this.descriptionAnswer = descriptionAnswer;
        this.isCorrect = isCorrect;
    }

    public String getCodeAnswer() {
        return codeAnswer;
    }

    public void setCodeAnswer(String codeAnswer) {
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
