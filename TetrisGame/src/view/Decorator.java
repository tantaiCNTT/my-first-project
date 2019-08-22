package view;

import java.awt.BorderLayout;

import javax.swing.JComponent;

public abstract class Decorator extends JComponent{
	 protected JComponent jc;
	public Decorator(JComponent c) {
		setLayout(new BorderLayout());
		add("Center", c);
	}
}
