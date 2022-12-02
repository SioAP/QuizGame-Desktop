package data;

import java.util.ArrayList;
import java.util.Random;

import model.Answer;
import model.Question;
import model.QuizGame;

public class DAOStub {

	public static int generateRandomNumber() {
        int randomNumber = new Random().nextInt(26 - 0 + 1) + 1;
        return randomNumber;
    }

    public static QuizGame getRandomQuizSetForQuizGame() {
    	QuizGame myRandomQuizGame = getQuizGame("Unkown");
    	
    	return myRandomQuizGame;
    }
    
    public static QuizGame getQuizGame(String playerNameParam) {
    	ArrayList<Question> questions = new ArrayList<Question>();
    	int myRandomNumber = 0;
    	
    	for(int i=0;i < 5;i++) {
    		myRandomNumber = generateRandomNumber();
    		questions.add(getAllQuestions().get(myRandomNumber));
    	}
    	  	
    	return new QuizGame(playerNameParam, 0, questions);
    }

    private static ArrayList<Question> getAllQuestions() {
    	 ArrayList<Question> allQuestions = new ArrayList<Question>();
    	 
    	 ArrayList<Answer> answers1 = new ArrayList<Answer>();
    	 answers1.add(createAnswer("a", "San Juan", false));
         answers1.add(createAnswer("b", "Asuncion", false));
         answers1.add(createAnswer("c", "San Jose", true));
         answers1.add(createAnswer("d", "Santiago", false));
         allQuestions.add(createQuestion(0, "Capital city of Costa Rica ?", answers1));
         
         ArrayList<Answer> answers2 = new ArrayList<Answer>();
         answers2.add(createAnswer("a", "Seoul", false));
         answers2.add(createAnswer("b", "Manila", true));
         answers2.add(createAnswer("c", "Hanoi", false));
         answers2.add(createAnswer("d", "Taipei", false));
         allQuestions.add(createQuestion(1, "Capital city of Philippines ?", answers2));
         
         ArrayList<Answer> answers3 = new ArrayList<Answer>();
         answers3.add(createAnswer("a", "Male", true));
         answers3.add(createAnswer("b", "Maseru", false));
         answers3.add(createAnswer("c", "Port Louis", false));
         answers3.add(createAnswer("d", "chisinau", false));
         allQuestions.add(createQuestion(2, "Capital city of Maldives ?", answers3));
         
         ArrayList<Answer> answers4 = new ArrayList<Answer>();
         answers4.add(createAnswer("a", "Muscat", false));
         answers4.add(createAnswer("b", "Munich", false));
         answers4.add(createAnswer("c", "Bucharest", true));
         answers4.add(createAnswer("d", "Belgrade", false));
         allQuestions.add(createQuestion(3, "Capital city of Romania ?", answers4));
         
         ArrayList<Answer> answers5 = new ArrayList<Answer>();
         answers5.add(createAnswer("a", "Brussels", false));
         answers5.add(createAnswer("b", "Bern", true));
         answers5.add(createAnswer("c", "San Marino", false));
         answers5.add(createAnswer("d", "Tallin", true));
         allQuestions.add(createQuestion(4, "Capital city of Switzerland ?", answers5));
         
         ArrayList<Answer> answers6 = new ArrayList<Answer>();
         answers6.add(createAnswer("a", "A sponge", false));
         answers6.add(createAnswer("b", "A stone", false));
         answers6.add(createAnswer("c", "A candle", false));
         answers6.add(createAnswer("d", "An egg", true));
         allQuestions.add(createQuestion(4, "What has to be broken before you can use it ?", answers6));
         
         ArrayList<Answer> answers7 = new ArrayList<Answer>();
         answers7.add(createAnswer("a", "Germany", false));
         answers7.add(createAnswer("b", "Uk", false));
         answers7.add(createAnswer("c", "New Zealand", true));
         answers7.add(createAnswer("d", "Italy", false));
         allQuestions.add(createQuestion(4, "What was the first country to approve women's suffrage ?", answers7));
         
         ArrayList<Answer> answers8 = new ArrayList<Answer>();
         answers8.add(createAnswer("a", "1959", false));
         answers8.add(createAnswer("b", "1969", true));
         answers8.add(createAnswer("c", "1967", false));
         answers8.add(createAnswer("d", "1981", false));
         allQuestions.add(createQuestion(4, "In what year did man reach the moon ?", answers8));
         
         ArrayList<Answer> answers9 = new ArrayList<Answer>();
         answers9.add(createAnswer("a", "Venice", true));
         answers9.add(createAnswer("b", "Milan", false));
         answers9.add(createAnswer("c", "Marseille", false));
         answers9.add(createAnswer("d", "Rome", false));
         allQuestions.add(createQuestion(4, "What was Marco Polo's home city ?", answers9));
         
         ArrayList<Answer> answers10 = new ArrayList<Answer>();
         answers10.add(createAnswer("a", "2000", false));
         answers10.add(createAnswer("b", "1985", false));
         answers10.add(createAnswer("c", "1994", true));
         answers10.add(createAnswer("d", "1952", false));
         allQuestions.add(createQuestion(4, "In what year did the Rwandan genocide take place ?", answers10));
         
         ArrayList<Answer> answers11 = new ArrayList<Answer>();
         answers11.add(createAnswer("a", "1991", true));
         answers11.add(createAnswer("b", "2015", false));
         answers11.add(createAnswer("c", "1960", false));
         answers11.add(createAnswer("d", "1500 BC ;)", false));
         allQuestions.add(createQuestion(4, "In what year was the Soviet Union dissolved ?", answers11));
         
         ArrayList<Answer> answers12 = new ArrayList<Answer>();
         answers12.add(createAnswer("a", "Canary Islands", false));
         answers12.add(createAnswer("b", "Malta", false));
         answers12.add(createAnswer("c", "Greece", true));
         answers12.add(createAnswer("d", "Cyprus", false));
         allQuestions.add(createQuestion(4, "To which country does the island of Crete belong ?", answers12));
         
         ArrayList<Answer> answers13 = new ArrayList<Answer>();
         answers13.add(createAnswer("a", "Poland", false));
         answers13.add(createAnswer("b", "Hungary", true));
         answers13.add(createAnswer("c", "Peru", false));
         answers13.add(createAnswer("d", "Luxembourg", false));
         allQuestions.add(createQuestion(4, "In which country in Europe is Magyar spoken ?", answers13));
         
         ArrayList<Answer> answers14 = new ArrayList<Answer>();
         answers14.add(createAnswer("a", "Brazil", false));
         answers14.add(createAnswer("b", "Japan", false));
         answers14.add(createAnswer("c", "China", false));
         answers14.add(createAnswer("d", "France", true));
         allQuestions.add(createQuestion(4, "What is the most visited country in the world ?", answers14));
         
         ArrayList<Answer> answers15 = new ArrayList<Answer>();
         answers15.add(createAnswer("a", "USA and Russia", true));
         answers15.add(createAnswer("b", "Morocco and Spain", false));
         answers15.add(createAnswer("c", "Japan and China", false));
         answers15.add(createAnswer("d", "UK and France", false));
         allQuestions.add(createQuestion(4, "Between which countries is the Bering Strait ?", answers15));

         ArrayList<Answer> answers16 = new ArrayList<Answer>();
         answers16.add(createAnswer("a", "Wolfgang Amadeus Mozart", false));
         answers16.add(createAnswer("b", "Van Gogh", false));
         answers16.add(createAnswer("c", "Pablo Picasso", true));
         answers16.add(createAnswer("d", "Leonardo Da Vinci", false));
         allQuestions.add(createQuestion(4, "Who painted the 'Guernica' ?", answers16));
         
         ArrayList<Answer> answers17 = new ArrayList<Answer>();
         answers17.add(createAnswer("a", "Jolly Jumper", false));
         answers17.add(createAnswer("b", "Rocinante", true));
         answers17.add(createAnswer("c", "Margarita", false));
         answers17.add(createAnswer("d", "John Doe", false));
         allQuestions.add(createQuestion(4, "What is the name of Don Quixote de la Mancha's horse ?", answers17));
         
         ArrayList<Answer> answers18 = new ArrayList<Answer>();
         answers18.add(createAnswer("a", "Butane gas", false));
         answers18.add(createAnswer("b", "Oxygen", false));
         answers18.add(createAnswer("c", "Hydrogen", false));
         answers18.add(createAnswer("d", "Ozone", true));
         allQuestions.add(createQuestion(4, "What gas in the atmosphere protects us from ultraviolet radiation ?", answers18));
         
         ArrayList<Answer> answers19 = new ArrayList<Answer>();
         answers19.add(createAnswer("a", "Sugar Cane", false));
         answers19.add(createAnswer("b", "Agave", true));
         answers19.add(createAnswer("c", "Rosemary", false));
         answers19.add(createAnswer("d", "Palm tree", false));
         allQuestions.add(createQuestion(4, "From which plant is tequila made ?", answers19));
         
         ArrayList<Answer> answers20 = new ArrayList<Answer>();
         answers20.add(createAnswer("a", "Baker Street", true));
         answers20.add(createAnswer("b", "Carnaby Street", false));
         answers20.add(createAnswer("c", "Barking Road", false));
         answers20.add(createAnswer("d", "Piccadilly Street", false));
         allQuestions.add(createQuestion(4, "What fictional street did Sherlock Holmes live on ?", answers20));
         
         ArrayList<Answer> answers21 = new ArrayList<Answer>();
         answers21.add(createAnswer("a", "Roger Moore", false));
         answers21.add(createAnswer("b", "Pierce Brosnan", false));
         answers21.add(createAnswer("c", "Sean Connery", true));
         answers21.add(createAnswer("d", "Daniel Craig", false));
         allQuestions.add(createQuestion(4, "Which of the actors who played James Bond fought Dr. No ?", answers21));
         
         ArrayList<Answer> answers22 = new ArrayList<Answer>();
         answers22.add(createAnswer("a", "Optimus Prime", true));
         answers22.add(createAnswer("b", "Amazon Prime", false));
         answers22.add(createAnswer("c", "Ironhide", false));
         answers22.add(createAnswer("d", "Megatron", false));
         allQuestions.add(createQuestion(4, "What is the name of the leader of the Autobots in the 'Transformers' movie saga ?", answers22));
         
         ArrayList<Answer> answers23 = new ArrayList<Answer>();
         answers23.add(createAnswer("a", "Madagascar", false));
         answers23.add(createAnswer("b", "USA", false));
         answers23.add(createAnswer("c", "China", false));
         answers23.add(createAnswer("d", "Uk", true));
         allQuestions.add(createQuestion(4, "Where was Ping-Pong invented?", answers23));
         
         ArrayList<Answer> answers24 = new ArrayList<Answer>();
         answers24.add(createAnswer("a", "Miami Heat", false));
         answers24.add(createAnswer("b", "Chicago Bulls", false));
         answers24.add(createAnswer("c", "Boston Celtics", true));
         answers24.add(createAnswer("d", "Los Angeles Lakers", false));
         allQuestions.add(createQuestion(4, "What is the NBA team with the most titles ?", answers24));
         
         ArrayList<Answer> answers25 = new ArrayList<Answer>();
         answers25.add(createAnswer("a", "John Terry", false));
         answers25.add(createAnswer("b", "Miroslav Klose", true));
         answers25.add(createAnswer("c", "Diego Armando Maradona", false));
         answers25.add(createAnswer("d", "Ronaldinho Gáucho", false));
         allQuestions.add(createQuestion(4, "Who is the all-time top scorer in the football World Cup?", answers25));
		
         return allQuestions;
    	 
	}

    public static Question createQuestion(int id, String descriptionQuestion, ArrayList<Answer> answers) {
        //TODO: Add validations for parameters - answers.length...
        return new Question(id, descriptionQuestion, answers);
    }

    public static Answer createAnswer(String codeAnswer, String descriptionAnswer, boolean isCorrect) {
        return new Answer(codeAnswer, descriptionAnswer, isCorrect);
    }
	
}
