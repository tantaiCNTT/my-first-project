package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReadFileHighScore {

	private ArrayList<HighScore> arrHightScore;
    public static ReadFileHighScore instance;
    public static ReadFileHighScore getIntance() {
    	if( instance == null) {
    		return new ReadFileHighScore();
    	}
    	return instance;
    }
	
	public ReadFileHighScore() {
		arrHightScore = new ArrayList<HighScore>();
		try {
			FileReader file = new FileReader("src/highScore/HightScore.txt");
			BufferedReader input = new BufferedReader(file);
			String line;
			while ((line = input.readLine()) != null) {
				String str[] = line.split(":");
				String name = str[0];
				int score = Integer.parseInt(str[1],10);
				HighScore hightScore = new HighScore(name, score);
				arrHightScore.add(hightScore);
			}
			input.close();
			// Loi khong tim thay file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Loi khong doc duoc file
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HighScore> getArrHightScore() {
		ArrayList<HighScore> result = this.arrHightScore;
		return sort(result);
	}
	
	
	// add Gamer for HighScore;
	public ArrayList<HighScore> sort(ArrayList<HighScore> result) {
		
		Collections.sort(result, new Comparator<HighScore>() {

			@Override
			public int compare(HighScore o1, HighScore o2) {
				return o2.getScore() - o1.getScore();
			}
		});
		return result;
	}

}
