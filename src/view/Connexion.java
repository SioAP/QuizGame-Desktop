package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Controller;
import model.User;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import websocket.*;

public class Connexion extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtPassword;
	private ClientWebsocket client;
	private Controller myController;

	/**
	 * Launch the application.
	 */
	public Connexion(Controller aController) {
		myController = aController;
	}
	
	public void launchView() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Connexion() {
		setTitle("Vinci QuizGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\workspaces\\eclipse-workspace\\QuizGame-Desktop\\img\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 358, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblConnexion = new JLabel("Connexion");
		lblConnexion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblConnexion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnexion.setBounds(0, 0, 358, 59);
		panel.add(lblConnexion);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("");
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setBounds(78, 98, 200, 35);
		panel.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setColumns(10);
		txtPassword.setBounds(78, 187, 200, 35);
		panel.add(txtPassword);
		
		JLabel lblLogin = new JLabel("Pseudonyme");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(78, 69, 200, 19);
		panel.add(lblLogin);
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(78, 158, 200, 19);
		panel.add(lblPassword);
		
		JButton btnRegister = new JButton("S'inscrire");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				client.createUser(txtLogin.getText(), txtPassword.getText());
				User user = myController.getMyUser();
				if (user.isConnected()) {
					
				}
			}
		});
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(10, 249, 140, 35);
		panel.add(btnRegister);
		
		JButton btnLogin = new JButton("S'indentifier");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBounds(208, 249, 140, 35);
		panel.add(btnLogin);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setForeground(new Color(255, 0, 0));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMessage.setBounds(78, 230, 200, 19);
		panel.add(lblMessage);
	}
}
