package model;

import java.awt.Color;

public class SBlock extends Block {

	public SBlock(GameBoard gameBoard) {
		super(gameBoard);
		init();
	}

	@Override
	public void init() {
		setSpinBehavior(new SpinWithBlock3x3());
		setTopLeftPosition(new Position(1, 4));
		potentialTopLeft = new Position(2, 4);
		color = new Color(191, 62, 255);
		coord = new Position[] { new Position(-1, 1), new Position(-1, 0), new Position(0, 0), new Position(0, -1) };
		tempCoord = new Position[] { new Position(-1, 1), new Position(-1, 0), new Position(0, 0), new Position(0, -1) };
	}

	@Override
	public void changeCoord() {
		gameBoard.addPosition(topLeftPosition.sum(coord[0]), 0);
		gameBoard.addPosition(topLeftPosition.sum(coord[1]), 0);
		gameBoard.addPosition(topLeftPosition.sum(coord[2]), 0);
		gameBoard.addPosition(topLeftPosition.sum(coord[3]), 0);
	}

}
