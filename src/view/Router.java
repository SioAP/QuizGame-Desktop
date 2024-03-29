package view;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Controller;
import java.awt.BorderLayout;

public class Router extends JFrame {

	private JPanel contentPane;
	private Controller myController;
	private PnlLogin pnlConnexion;
	private PnlGamemode pnlModejeu;
	private PnlRegister pnlInscritpion;

	/**
	 * Launch the application.
	 */
	public Router(Controller aController) {
		myController = aController;

		setTitle("Vinci QuizGame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\workspaces\\eclipse-workspace\\QuizGame-Desktop\\img\\logo.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 389, 351);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//ImagePanel panel = new ImagePanel("img/background.jpg");
		//panel.setBounds(0, 88, 124, -88);
		//getContentPane().add(panel);
		

		//PnlGame pnlJeu = new PnlGame(myController);
		//contentPane.add(pnlJeu);
		
		//pnlModejeu = new PnlGamemode(myController);
		//contentPane.add(pnlModejeu);
		

		//PnlRegister pnlInscription = new PnlRegister(myController);
		//contentPane.add(pnlInscription);
			
		pnlConnexion = new PnlLogin(myController);	
		contentPane.add(pnlConnexion);
		pnlConnexion.setLayout(new BorderLayout(0, 0));
		
		
		
		// --pour changer de fenetre
		/*
		this.pnlConnexion.setVisible(false);
		this.contentPane.remove(pnlConnexion);
		this.pnlConnexion = null;
		*/
		
	}


	public PnlLogin getPnlConnexion() {
		return pnlConnexion;
	}


	public void setPnlConnexion(PnlLogin pnlConnexion) {
		this.pnlConnexion = pnlConnexion;
	}


	public PnlGamemode getPnlModejeu() {
		return pnlModejeu;
	}


	public void setPnlModejeu(PnlGamemode pnlModejeu) {
		this.pnlModejeu = pnlModejeu;
	}


	public PnlRegister getPnlInscritpion() {
		return pnlInscritpion;
	}


	public void setPnlInscritpion(PnlRegister pnlInscritpion) {
		this.pnlInscritpion = pnlInscritpion;
	}
	
}
