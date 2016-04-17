package Model;

import java.util.ArrayList;
import java.util.Random; 

public class Litterers extends GameObject{

	private ArrayList<Litterer> lits;
	
	public Litterers(ArrayList<Litterer> l) {
		lits = l;
	}
	
	public boolean shouldBeRemoved(Litterer lit) {
		if(lit.getL().getWasCollected())
			return true;
		else if(lit.getL().getPosition().getY() > Game.BACKGROUND_HEIGHT)
			return true;
		else
			return false;
	}
	
	public ArrayList<Litterer> getLits() {
		return lits;
	}
	
	public void addLitterer() {
		Random r = new Random();
		int bound = r.nextInt(100);
		if(bound == 50) {
			Litterer lit = new Litterer();
			lits.add(lit);
		}
	}
	
	public void onTick() {
		for(int i = 0; i < lits.size(); i++) {  	// litterers move left or right
			lits.get(i).move();
			if(shouldBeRemoved(lits.get(i))) {      // remove if shouldBeRemoved
				lits.remove(i);
			}
		}
		addLitterer();
	}
}