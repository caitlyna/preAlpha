package Model;

public class You extends GameObject {
	
	private boolean trashCollected = false;
	private boolean recycleCollected = false;
	private boolean rightObject = false;
	private int binOffset = 5;					// subject to change
	private int binWidth = 5;					// subject to change
	
	public You(Position p, Velocity v){
		pos = p;
		vel = v;
	}

	public boolean wasTrashCollected() {
		return trashCollected;
	}

	public void setTrashCollected(boolean b) {
		this.trashCollected = b;
	}

	public boolean wasRecycleCollected() {
		return recycleCollected;
	}

	public void setRecycleCollected(boolean b) {
		this.recycleCollected = b;
	}

	public boolean isRightObject() {
		return rightObject;
	}

	public void setRightObject(boolean b) {
		this.rightObject = b;
	}
	
	public void positionBounds(){
		if (pos.getX() < 0){
			pos.setX(0);
		}
		if (pos.getX() > Game.BACKGROUND_WIDTH){  // probably make a boundary again
			pos.setX(Game.BACKGROUND_WIDTH);
		}
	}
	
	public void move(){
		if(vel.getDirection() == 3) {
			pos.setX(pos.getX() + vel.getMagnitude()); // move right
		}
		else if(vel.getDirection() == 1) {
			pos.setX(pos.getX() - vel.getMagnitude());   // move left
		}
	}
	
	public boolean didCollectTrash(Litterer lit){
		if (Math.abs(lit.getL().getPosition().getX() - (pos.getX() - binOffset)) <= binWidth	// trash will be in left hand
				&& lit.getL().getPosition().getY() >= pos.getY()){
			lit.getL().setWasCollected(true);
			return true;
		}
		else return false;
	}
	
	public boolean didCollectRecycle(Litterer lit){
		if (Math.abs(lit.getL().getPosition().getX() - (pos.getX() + binOffset)) <= binWidth	// trash will be in right hand
				&& lit.getL().getPosition().getY() >= pos.getY()){
			lit.getL().setWasCollected(true);
			return true;
		}
		else return false;
	}
	
	public boolean collectRightObject(Litterer lit){
		if (didCollectRecycle(lit)){
			if (lit.getL().getType() == 1){
				return true;
			}
		}
		else if (didCollectTrash(lit)){
			if (lit.getL().getType() == 0){
				return true;
			}
		}
		return false;
	}
	
	public boolean collectWrongObject(Litterer lit){
		if (didCollectRecycle(lit)){
			if (lit.getL().getType() == 0){
				return true;
			}
		}
		else if (didCollectTrash(lit)){
			if (lit.getL().getType() == 1){
				return true;
			}
		}
		return false;
	}
	
	public void onTick(){
		move();
		
	}
}
