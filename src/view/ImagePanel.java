package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import control.Controller;

public class ImagePanel extends JPanel {
    
    private Image backgroundImage;
	private Router myConnexion;
	private Controller myController;

    public ImagePanel(String fileName) {
        backgroundImage = new ImageIcon(fileName).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 50, 50, getWidth(), getHeight(), this);
    }
}