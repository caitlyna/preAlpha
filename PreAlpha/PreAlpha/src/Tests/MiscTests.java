package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Model.Position;
import Model.Timer;
import Model.Velocity;


public class MiscTests {

	@Test
	public void positionTests() {
		Position p = new Position(10,10);
		
		assertEquals(10, p.getX());
		assertEquals(10, p.getY());
		
		p.setX(88);
		assertEquals(88, p.getX());
		p.setY(88);
		assertEquals(88, p.getY());
	}
	
	@Test
	public void velocityTests() {
		Velocity v = new Velocity(10, 2);
		
		assertEquals(2, v.getDirection());
		assertEquals(10, v.getMagnitude());
		
		v.setDirection(3);
		assertEquals(3, v.getDirection());
		v.setMagnitude(44);
		assertEquals(44, v.getMagnitude());
		
	}
	
	@Test
	public void timerTests() {
		Timer t = new Timer(100.0, false);
		
		assertEquals(100,00, t.getTimeLeft());
		assertFalse(t.isTimeIsUp());
		
		t.setTimeIsUp(true);
		assertTrue(t.isTimeIsUp());
		
		t.setTimeLeft(200.0);
		assertEquals(200, 0, t.getTimeLeft());
	}

}
