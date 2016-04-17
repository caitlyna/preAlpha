package Model;

public abstract class Game {
	
	int score;
	Timer timer;
	boolean end = false;

	
	public static final int BACKGROUND_WIDTH = 1400;
	public static final int BACKGROUND_HEIGHT = 900;
	
	public Game(int s, Timer t) {
		this.score = s;
		this.timer = t;
	}

	public int getScore() {
		return score;
	}
	
	public Timer getTimer(){
		return timer;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public boolean getEnd() {
		return end;
	}
	
	public void setEnd(boolean b) {
		this.end = b;
	}

}
