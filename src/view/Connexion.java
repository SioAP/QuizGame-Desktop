package view;

import java.awt.Toolkit;
import view.PnlRegister;
import javax.imageio.spi.RegisterableService;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Controller;

public class Connexion extends JFrame {

	private JPanel contentPane;
	private Controller myController;


	/**
	 * Launch the application.
	 */
	public Connexion(Controller aController) {
		myController = aController;

		setTitle("Vinci QuizGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\workspaces\\eclipse-workspace\\QuizGame-Desktop\\img\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PnlRegister pnlInscription = new PnlRegister(myController);
		contentPane.add(pnlInscription);
		
		//PnlLogin pnlConnexion = new PnlLogin(myController);
		//contentPane.add(pnlConnexion);
		
		/*
		this.pnlConnexion.setVisible(false);
		this.contentPane.remove(pnlConnexion);
		this.pnlConnexion = null;
		
				*/


	
		
	}
}
