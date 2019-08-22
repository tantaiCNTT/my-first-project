package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import controller.IController;

public class ViewOption extends JFrame {
	private JPanel panel;

	public ViewOption() {
		super.setTitle("Guide");
		init();
	}

	public void init() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		panel = new JPanel();
		setContentPane(new JLabel(new ImageIcon("image/ImageOptionBackGround.png")));
		setSize(340, 490);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().add(panel);
		panel.setOpaque(false);

	}
}
