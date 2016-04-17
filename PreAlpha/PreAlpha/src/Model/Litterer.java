package Model;

import java.util.Random; 

public class Litterer extends GameObject{
	
	private int type = 1;   // 1 is person, 0 is dog
	private Litter l;
	
	public Litterer(int t, Litter a) {
		type = t;
		l = a;
	}
	
	public Litterer() {
		pos.setX(0);
		pos.setY(10);
		vel.setMagnitude(10);
		vel.setDirection(3);
		
		Random r = new Random();
		int bound = r.nextInt(100);
		if(bound % 3 == 0)
			l = new Litter(new Position(0,10), new Velocity(10,3), 0);  // recycle
		else
			l = new Litter(new Position(0,10), new Velocity(10,3), 1);  // trash

			
	}

	public Litter getL() {
		return l;
	}

	public void setL(Litter l) {
		this.l = l;
	}

	public int getType() { // trash vs recycling
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public void move(){
		if(vel.getDirection() == 1) {
			pos.setX(pos.getX() + vel.getMagnitude());  // move right
		}
		else if(vel.getDirection() == 3) {
			pos.setX(pos.getX() - vel.getMagnitude());  // move left
		}
		getL().move();
	}
	
	// public void drop(){}
	
	// public void decide(){}
	
	public void appear(){
		//add to arraylist
	}
	
	public void onTick(){
		// move()
	}
	
	public void remove(){
		//remove from arraylist
	}
}
