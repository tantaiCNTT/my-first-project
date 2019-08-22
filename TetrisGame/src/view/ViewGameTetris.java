package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.IController;
import model.GameBoard;
import model.IModel;

public class ViewGameTetris extends JFrame implements IViewTetris {
	private static final long serialVersionUID = 1L;
	private JPanel panelGame;
	private JPanel  panel;
	private IController controller;
	private GameBoard game ;
    private JFrame fSave;
	
	public ViewGameTetris(IController controller) {
		super("Tetris - Group11");
		this.controller = controller;
		
	}
	@Override
	public void start() {
					
		ViewScore panelS = new ViewScore(game.getInstance(controller) );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setSize(460, 660);
		panelGame = new PanelGame(controller);
		panelS.setBackground(new Color(66, 66, 66, 160));
		setLayout(new BorderLayout());
		getContentPane().add(panelGame);
		getContentPane().add(panelS);

		setFocusable(true);
		setResizable(false);
		addEvent();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void update() {
		repaint();
	}

	public void addEvent() {
		addKeyListener(keyEvent());
	}

	public KeyListener keyEvent() {
		return new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					controller.ronate();
				}
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					controller.fastDown();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					controller.moveLeft();
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					controller.moveRight();
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					controller.moveDown();
				}
			}
		};
	}

	@Override
	public void pause() {
		setVisible(false);
	}

	@Override
	public void lose() {
		
        fSave = new ViewSaveResult();
		this.dispose();
	}

	@Override
	public void resume() {
		setVisible(true);
	}


	@Override
	public void hidden() {
		setVisible(false);
	}



}
