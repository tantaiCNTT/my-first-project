package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.HighScore;
import model.ReadFileHighScore;

public class ViewHighScore extends JFrame {
	protected JPanel highScore;
	public ReadFileHighScore readFile;
	private ArrayList<HighScore> listHighScore = readFile.getIntance().getArrHightScore();
	
    private JLabel jl;
	private ImageIcon icon;
	
	
	public ViewHighScore() {
		init();
	}

	public void init() {
        jl = new JLabel();
        icon = new ImageIcon("image/BackGroundHighScore.png");
		highScore = pnHighScore;
	    jl.setIcon(icon);
		highScore.setLayout(null);
		highScore.add(jl);
		setVisible(true);
		setSize(340, 510);
		setFocusable(true);
		setResizable(false);
		setLocationRelativeTo(null);
		add(highScore);

	}

	private JPanel pnHighScore = new JPanel() {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			drawImage(g2d);
			if (listHighScore != null) {
				drawHighScore(g2d);
			}

		}
	};
	
	public void drawImage(Graphics2D g) {
		Image imgaeBg = new ImageIcon("image/BackGroundHighScore.png").getImage();
		g.drawImage(imgaeBg, 0, 0, null);
	}

	private void drawHighScore(Graphics2D g2d) {
		g2d.setStroke(new java.awt.BasicStroke(2));
		g2d.setFont(new Font("Arial", 0, 40));
		g2d.setColor(Color.RED);
		int y = 160;
         
		for (int i = 0; i < listHighScore.size(); i++) {
			if( i < 5) {
			g2d.drawString("" + (i + 1), 45, y);
			g2d.drawString(". " + listHighScore.get(i).getName(), 65, y);
			g2d.drawString("" + listHighScore.get(i).getScore(), 230, y);
			y = y + 55;
		}
		}

	}

	public void setListHighScore(ArrayList<HighScore> newListHighScore) {
		this.listHighScore = newListHighScore;

	}

}
