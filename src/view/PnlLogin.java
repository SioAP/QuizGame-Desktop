package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import control.Controller;
import model.User;


public class PnlLogin extends JPanel {
	
	private Controller myController;
	private JTextField txtLogin;
	private JPasswordField txtPassword;

	
	public PnlLogin(Controller controller) {
		myController = controller;
	
		
		setBounds(10, 10, 358, 294);
		setLayout(null);
		
		JLabel lblConnexion = new JLabel("Connexion");
		lblConnexion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConnexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnexion.setBounds(0, 0, 358, 59);
		add(lblConnexion);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("");
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setBounds(78, 98, 200, 35);
		add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblLogin = new JLabel("Pseudonyme");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(78, 69, 200, 19);
		add(lblLogin);
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(78, 158, 200, 19);
		add(lblPassword);
		
		JButton btnRegister = new JButton("S'inscrire");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				myController.getMyView().getPnlConnexion().setVisible(false);
				myController.getMyView().remove(myController.getMyView().getPnlConnexion());
				myController.getMyView().setPnlConnexion(null);
				
				myController.getMyView().setPnlInscritpion(new PnlRegister(controller));
				myController.getMyView().add(myController.getMyView().getPnlInscritpion());
				
			}
		});
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(10, 249, 140, 35);
		add(btnRegister);
		
		JButton btnLogin = new JButton("S'indentifier");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
	
					
					myController.getMyView().getPnlConnexion().setVisible(false);
					myController.getMyView().remove(myController.getMyView().getPnlConnexion());
					myController.getMyView().setPnlConnexion(null);
					
					myController.getMyView().setPnlModejeu(new PnlGamemode(controller));
					myController.getMyView().add(myController.getMyView().getPnlModejeu());
					
//				else {
//					JLabel lblLoginerreur = new JLabel("Utilisateur ou mot de passe invalide");
//					lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
//					lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
//				}
			}
		});
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(208, 249, 140, 35);
		add(btnLogin);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setForeground(new Color(255, 0, 0));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMessage.setBounds(78, 230, 200, 19);
		add(lblMessage);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(78, 187, 200, 35);
		add(txtPassword);
		
	}

}
