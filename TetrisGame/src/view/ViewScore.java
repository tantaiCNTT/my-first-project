package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.GameBoard;

public class ViewScore extends JPanel implements Observer {
	private int newScore ;
    private JLabel jl;
	public ViewScore(Observable o) {
		jl = new JLabel();
		o.addObserver(this);
		add(jl);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof GameBoard) {
			this.newScore = ((GameBoard) o).getScore();
			this.repaint();
		}
	}

@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(2));
	g2.setColor(Color.BLACK);
	g2.setFont(new Font("SVN-Block", Font.BOLD, 30));
	g2.drawString("Score", 20 + 10 * 30, 185);
	g2.setColor(new Color(66, 66, 66, 180));
	g2.drawRoundRect(20 + 10 * 30, 190, 30 * 4, 30 * 1, 5, 5);
	g2.setFont(new Font("Digital-7", Font.LAYOUT_RIGHT_TO_LEFT, 30));
	g2.setColor(Color.GREEN);
	g2.drawString(this.newScore + "", 20 + 10 * 30, 215);
}

}
