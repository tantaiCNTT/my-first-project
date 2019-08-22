package model;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileHighScore {
	private static WriteFileHighScore w = new WriteFileHighScore();
	private FileOutputStream fos;
	private DataOutputStream dos;
	private String textScore = "";

	private WriteFileHighScore() {
	}

	public void writeScore(ReadFileHighScore r) {
		try {
			for (HighScore hg : r.getArrHightScore())
				textScore += hg + "\n";
			fos = new FileOutputStream("src/highScore/HightScore.txt");
			dos = new DataOutputStream(fos);
			dos.writeBytes(textScore);
			fos.close();
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static WriteFileHighScore getInstance() {
		return w;
	}
}
