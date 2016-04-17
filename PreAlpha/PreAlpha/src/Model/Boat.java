package Model;

public class Boat extends GameObject {
	
	Tool rightTool;
	boolean hasProblem;
	
	public Boat(Position p, Velocity v, Tool yes, boolean problem) {
		this.pos = p;
		this.vel = v;
		this.rightTool = yes;
		this.hasProblem = problem;
	}

	public Tool getRightTool() {
		return rightTool;
	}

	public void setRightTool(Tool rightTool) {
		this.rightTool = rightTool;
	}

	public boolean isHasProblem() {
		return hasProblem;
	}

	public void setHasProblem(boolean hasProblem) {
		this.hasProblem = hasProblem;
	}
	
	public boolean usingRightTool(Tool t) {
		return true;
	}
	
	public void remove() {}
	
	public void move() {}
	
	public void onTick() {}

}
