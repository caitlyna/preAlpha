package Model;
import Other.Moveable;
import Other.Tickable;

public abstract class GameObject implements Tickable, Moveable{
	
	public Position pos;
	public Velocity vel;
	
	public Position getPosition() {
		return pos;
	}

	public void setPosition(Position p) {
		this.pos = p;
	}

	public Velocity getVelocity() {
		return vel;
	}

	public void setVelocity(Velocity v) {
		this.vel = v;
	}

	public void onTick(){}
	
	public void move(){}
	
}
