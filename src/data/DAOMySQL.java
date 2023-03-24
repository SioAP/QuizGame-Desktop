package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import control.Controller;
import model.Answer;
import model.Question;

public class DAOMySQL {

	private Controller myController;

	private Connection cnx = null;
	private Statement stmt = null;
	private String url;
	private String login;
	private String password;

	public DAOMySQL(Controller aController) {

		this.myController = aController;
		
		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("conf.properties")) {
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 url = props.getProperty("jdbc.url");
		 login = props.getProperty("jdbc.login");
		 password = props.getProperty("jdbc.password");
	}
	

//	public boolean connectDatabase() throws Exception {
//	
//		try {
//			//1-load the driver
//			Class.forName(props.getProperty("jdbc.driver.class"));
//			//2- create a connection - a plug on driver
//			this.cnx = DriverManager.getConnection(url, login, password);
//			//3- connect a wire - the statement
//			this.stmt = cnx.createStatement();
//			return true;
//		}
//		catch (Exception e) {
//			System.out.println("Connexion Error");
//			return false;
//		}
//	}
	
	  private ArrayList<Answer> getAnswers(int id) {
			ArrayList<Answer> Answers = new ArrayList<Answer>();
			ResultSet rs;
			try (Connection connection = DriverManager.getConnection(url, login, password);
					Statement st = connection.createStatement()) {
				rs =st.executeQuery("SELECT * FROM quiz_db.answer WHERE id_question = " + id);
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
	
	
	 public Question findQuestion(int randomNumber) {
			Question aQuestion = null;
			ResultSet rs;
			try (Connection connection = DriverManager.getConnection(url, login, password);
					Statement st = connection.createStatement()) {
				rs = st.executeQuery("SELECT * FROM quiz_db.question WHERE id_question = " + randomNumber);
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

	public Statement getStmt() {
		return stmt;
	}
}
