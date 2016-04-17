package Model;
import Other.Tickable;

public class Timer implements Tickable {
	
	double timeLeft;
	boolean timeIsUp;
	
	public Timer(double left, boolean up) {
		this.timeLeft = left;
		this.timeIsUp = up;
	}

	public double getTimeLeft() {
		return timeLeft;
	}

	public void setTimeLeft(double timeLeft) {
		this.timeLeft = timeLeft;
	}

	public boolean isTimeIsUp() {
		return timeIsUp;
	}

	public void setTimeIsUp(boolean timeIsUp) {
		this.timeIsUp = timeIsUp;
	}
	
	public void checkTime() {}   // do we need this?
	
	public void startTimer() {}  // do we need this?
	
	public boolean isTimeUp() {
		return timeIsUp;
	}
	
	public void onTick() {
		setTimeLeft(timeLeft--);
	}
	
}
