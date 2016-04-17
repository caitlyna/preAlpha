package Controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BeachUser implements MouseListener {
	
	BeachActivity act;

	public void mouseClicked(MouseEvent e) {
		if(e.getX() < act.getBeachgame().getPlayer().getPosition().getX())
			act.getBeachgame().getPlayer().getVelocity().setDirection(1); // move left
		else if(e.getX() > act.getBeachgame().getPlayer().getPosition().getX())
			act.getBeachgame().getPlayer().getVelocity().setDirection(3); // move right
	}

	public void mousePressed(MouseEvent e) {
		// unneeded
	}

	public void mouseReleased(MouseEvent e) {
		// unneeded
	}

	public void mouseEntered(MouseEvent e) {
		// unneeded
	}

	public void mouseExited(MouseEvent e) {
		// unneeded
	}
	

}
