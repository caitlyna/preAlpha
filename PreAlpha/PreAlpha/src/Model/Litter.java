package Model;

public class Litter extends GameObject{
	
	private int type;								// 0 for recycle, 1 for trash
	private boolean wasDropped = false;
	private boolean wasCollected = false;
	
	public Litter(Position p, Velocity v, int t){
		pos = p;
		vel = v;
		type = t;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void move(){
		if(getwasDropped() == false)
			pos.setX(pos.getX() + vel.getMagnitude());
		else
			pos.setY(pos.getY() + vel.getMagnitude());
	}
	
	public boolean getwasDropped() {
		return wasDropped;
	}
	
	public boolean getWasCollected() {
		return wasCollected;
	}
	
	public void setWasDropped(boolean b) {
		wasDropped = b;
	}
	
	public void setWasCollected(boolean b) {
		wasCollected = b;
	}
	
	public void onTick(){
	}
}
