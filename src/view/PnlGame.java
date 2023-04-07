package view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import control.Controller;
import view.Connexion;

	
public class PnlGame extends JPanel {
	
	private Connexion myConnexion;
	private Controller myController;
	
	public PnlGame(Controller controller) {
		myController = controller;
		
		
		setBounds(10, 10, 358, 294);
		setLayout(null);
		
		JLabel lblGame = new JLabel("Game");
		lblGame.setFont(new Font("Consolas", Font.BOLD, 30));
		lblGame.setBounds(132, 11, 74, 30);
		add(lblGame);
		
		JLabel lblquestions = new JLabel("Question");
		lblquestions.setBounds(21, 92, 46, 14);
		add(lblquestions);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(21, 128, 109, 23);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(21, 164, 109, 23);
		add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(21, 206, 109, 23);
		add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(21, 244, 109, 23);
		add(rdbtnNewRadioButton_3);
		
	}

}