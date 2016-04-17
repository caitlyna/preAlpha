package Model;

public class Velocity {
	
	private int magnitude;
	private int direction; // 1 = LEFT, 2 = UP, 3 = RIGHT, 4 = DOWN
	
	public Velocity(int mag, int dir){
		magnitude = mag;
		direction = dir;
	}

	public int getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(int magnitude) {
		this.magnitude = magnitude;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	
}
