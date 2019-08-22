package Threads;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import controller.IController;

public class ThreadKeyListener {
	IController controller;

	public ThreadKeyListener(IController c) {
		super();
		this.controller = c;
	}
	

	public KeyListener keyEvent() {
		return new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
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
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					controller.ronate();
				}
				
			}
		};
	}

}
