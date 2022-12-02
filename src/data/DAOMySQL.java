package data;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import control.Controller;

public class DAOMySQL {

	private Controller myController;

	private Connection cnx = null;
	private Statement stmt = null;

	public DAOMySQL(Controller aController) {

		this.myController = aController;
	}

	public boolean connectDatabase() throws Exception {
		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("conf.properties")) {
			props.load(fis);
		}
		String url = props.getProperty("jdbc.url");
		String login = props.getProperty("jdbc.login");
		String password = props.getProperty("jdbc.password");
		try {
			//1-load the driver
			Class.forName(props.getProperty("jdbc.driver.class"));
			//2- create a connection - a plug on driver
			this.cnx = DriverManager.getConnection(url, login, password);
			//3- connect a wire - the statement
			this.stmt = cnx.createStatement();
			return true;
		}
		catch (Exception e) {
			System.out.println("Connexion Error");
			return false;
		}
	}

	public Statement getStmt() {
		return stmt;
	}
}
