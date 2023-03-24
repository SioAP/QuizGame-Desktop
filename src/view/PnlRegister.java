package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import control.Controller;

public class PnlRegister extends JPanel {
	
	private Controller myController;
	private JTextField textUser;
	private JPasswordField txtpassword;
	private JPasswordField txtpasswordconfirm;
	
	public PnlRegister(Controller controller) {
		myController = controller;
		
		
		setBounds(0, 0, 375, 312);
		setLayout(null);
		
		JLabel lbluser = new JLabel("Utilisateur :");
		lbluser.setBounds(29, 71, 102, 40);
		add(lbluser);
		
		textUser = new JTextField();
		textUser.setBounds(29, 110, 86, 20);
		add(textUser);
		textUser.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(29, 174, 86, 20);
		add(txtpassword);
		
		txtpasswordconfirm = new JPasswordField();
		txtpasswordconfirm.setBounds(29, 229, 86, 20);
		add(txtpasswordconfirm);
		
		JLabel lblpassword = new JLabel("mot de passe :");
		lblpassword.setBounds(29, 141, 86, 14);
		add(lblpassword);
		
		JLabel lblpasswordconfirm = new JLabel("confirmer votre mot de passe :");
		lblpasswordconfirm.setBounds(29, 205, 163, 14);
		add(lblpasswordconfirm);
		
		JButton btnInscription = new JButton("S'inscrire");
		btnInscription.setBounds(226, 260, 89, 23);
		add(btnInscription);
	}
}