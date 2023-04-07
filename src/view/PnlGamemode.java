package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.Controller;

	
public class PnlGamemode extends JPanel {
	
	private Controller myController;
	
	public PnlGamemode(Controller controller) {
		myController = controller;
		
		
		setBounds(10, 10, 358, 294);
		setLayout(null);
		
		JLabel lblModeJeu = new JLabel("Mode de jeu");
		lblModeJeu.setFont(new Font("Consolas", Font.BOLD, 17));
		lblModeJeu.setBounds(124, 78, 134, 63);
		add(lblModeJeu);
		

		JButton btnSolo = new JButton("Solo");
		btnSolo.setFont(new Font("Consolas", Font.BOLD, 14));
		btnSolo.setBackground(Color.DARK_GRAY);
		btnSolo.setBounds(45, 206, 110, 36);
		add(btnSolo);

		JButton btnMultiplayer = new JButton("Mutliplayer");
		btnMultiplayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplayer.setFont(new Font("Consolas", Font.BOLD, 12));
		btnMultiplayer.setBackground(Color.DARK_GRAY);
		btnMultiplayer.setBounds(220, 206, 110, 36);
		add(btnMultiplayer);
		
	}

}