package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import controller.IController;
import model.GameBoard;
import model.HighScore;
import model.ReadFileHighScore;
import model.WriteFileHighScore;
import sound.Music;

public class ViewSaveResult extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JTextField textField;
	private ReadFileHighScore readfile;
	private WriteFileHighScore writeFile;
	private ViewHighScore viewHighScore;
	private JButton btnSave;
	IController controller;
	private GameBoard game;
	private JLabel jlbNewLabel, jlbNewLabel_1, jlbMessege, jlbScore;

	public ViewSaveResult() {
		setSize(460, 660);

		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel jlbNewLabel = new JLabel("Enter your name");

		jlbNewLabel.setForeground(Color.BLUE);
		jlbNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		jlbNewLabel.setBounds(110, 16, 220, 60);
		contentPane.add(jlbNewLabel);

		textField = new JTextField("");
		textField.setBounds(140, 100, 250, 34);
		contentPane.add(textField);
		textField.setColumns(5);

		JLabel jlbNewLabel_1 = new JLabel("Name Gamer: ");
		jlbNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		jlbNewLabel_1.setForeground(Color.ORANGE);
		jlbNewLabel_1.setBounds(15, 100, 138, 34);
		contentPane.add(jlbNewLabel_1);

		jlbMessege = new JLabel("Your Score");
		jlbMessege.setBounds(110, 200, 300, 120);
		jlbMessege.setFont(new Font("Arial", Font.BOLD, 45));
		jlbMessege.setForeground(Color.GREEN);
		contentPane.add(jlbMessege);

		String str = String.valueOf(game.getInstance(controller).getsaveScore());
		jlbScore = new JLabel(str);
		jlbScore.setBounds(170, 340, 300, 150);
		jlbScore.setForeground(Color.YELLOW);
		jlbScore.setFont(new Font("Arial", Font.BOLD, 140));

		contentPane.add(jlbScore);

		btnSave = new JButton("Save");

		btnSave.addActionListener(this);
		btnSave.setBounds(160, 160, 115, 40);
		contentPane.add(btnSave);

		contentPane.setBackground(Color.DARK_GRAY);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSave) {
			String name = textField.getText();
			if (name.equalsIgnoreCase("")) {
				JOptionPane.showMessageDialog(null, "Please enter your name");
			} else {

				int score = game.getInstance(controller).getsaveScore();
				HighScore s = new HighScore(name, score);
				readfile = ReadFileHighScore.getIntance();
				readfile.getArrHightScore().add(s);
				writeFile = WriteFileHighScore.getInstance();
				writeFile.writeScore(readfile);

				setVisible(false);
				ViewTetris view = new ViewTetris(new Controller());
				view.setVisible(false);

			}

		}

	}

}
