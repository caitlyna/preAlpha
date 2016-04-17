package Model;

public class Tool extends GameObject {

	Position pos;
	
	public Tool(Position p) {
		this.pos = p;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	void fix() {} // Unsure
	
	void performAction() {} // Unsure
	
	void reset() {}
	
	public void remove() {}
	
	public void move() {}
	
	public void onTick() {}
	
}
