package Model;
public class Plant extends GameObject {

	int type;
	Position pos;
	boolean wasPulled;
	
	public Plant(int t, Position p, boolean was) {
		this.type = t;
		this.pos = p;
		this.wasPulled = was;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public boolean isWasPulled() {
		return wasPulled;
	}

	public void setWasPulled(boolean wasPulled) {
		this.wasPulled = wasPulled;
	}
	
	public void remove() {}
	
	public void move() {}
	
	public void onTick() {}
}
