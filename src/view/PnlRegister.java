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
		lbluser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbluser.setBounds(124, 11, 102, 40);
		add(lbluser);
		
		textUser = new JTextField();
		textUser.setBounds(76, 48, 200, 35);
		add(textUser);
		textUser.setColumns(10);
		textUser.setToolTipText("");
		textUser.setHorizontalAlignment(SwingConstants.CENTER);

		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(76, 111, 200, 35);
		add(txtpassword);
		
		txtpasswordconfirm = new JPasswordField();
		txtpasswordconfirm.setBounds(76, 178, 200, 35);
		add(txtpasswordconfirm);
		
		JLabel lblpassword = new JLabel("mot de passe :");
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpassword.setBounds(127, 83, 122, 23);
		add(lblpassword);
		
		JLabel lblpasswordconfirm = new JLabel("confirmer votre mot de passe :");
		lblpasswordconfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblpasswordconfirm.setBounds(74, 157, 212, 14);
		add(lblpasswordconfirm);
		
		JButton btnInscription = new JButton("S'inscrire");
		btnInscription.setBounds(196, 229, 140, 35);
		btnInscription.setBackground(new Color(255, 255, 255));
		btnInscription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btnInscription);

		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(21, 229, 140, 35);
		btnRetour.setBackground(new Color(255, 255, 255));
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btnRetour);
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myController.getMyConsole().getPnlInscritpion().setVisible(false);
				myController.getMyConsole().remove(myController.getMyConsole().getPnlInscritpion());
				myController.getMyConsole().setPnlInscritpion(null);
				
				myController.getMyConsole().setPnlConnexion(new PnlLogin(controller));
				myController.getMyConsole().add(myController.getMyConsole().getPnlConnexion());
			}
		});
		
	}
}