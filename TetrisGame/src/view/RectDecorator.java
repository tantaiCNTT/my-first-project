package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class RectDecorator extends Decorator {
	private int x1, y1, w1, h1;
	public RectDecorator(JComponent c) {
		super(c);
	}
	public void setBounds(int x, int y, int w, int h) {
		this.x1 = x;
		this.y1 = y;
		this.w1 = w;
		this.h1 = h;
		super.setBounds(x, y, w, h);
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillRect(w1 / 2 - 60, h1 - 40, (w1) / 10, (w1) / 10);
	}
}
