package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

public class CircleDecorater extends Decorator {
	private boolean mouseOver;
	private  JComponent  thisComp;
	private int x1, y1, w1, h1;
	public CircleDecorater(JComponent c) {
		super(c);
		mouseOver = false;
		thisComp = this;
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mouseOver = true;
				thisComp.repaint();
			}
		});
	}
	public void setBounds(int x, int y, int w, int h) {
		x1 = x;
		y1 = y;
		w1 = w;
		h1 = h;
		super.setBounds(x, y, w, h);
	}
	public void paint(Graphics g) {
		super.paint(g);
		if(mouseOver == true) {
		g.setColor(Color.RED);
		g.fillOval(w1/2 - 60 ,h1 - 30, (w1) / 10, (w1) / 10);
		}
	
			
		
		
	}
	

}
