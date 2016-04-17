package Tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import Model.Litter;
import Model.Litterer;
import Model.Litterers;
import Model.Position;
import Model.Velocity;
import Model.You;

public class CharacterTests {

	@Test
	public void youTests() {
		Position p = new Position(88, 88);
		Velocity v = new Velocity(10, 2);
		You y = new You(p, v);
		Litter x = new Litter(p, v, 1);
		Litterer l = new Litterer(0, x);
		
		assertEquals(true, y.collectRightObject(l));
		assertEquals(false, y.collectWrongObject(l));
		
		y.setRecycleCollected(true);
		y.setTrashCollected(false);
		y.setRightObject(true);
		assertEquals(true, y.wasRecycleCollected());
		assertEquals(false, y.wasTrashCollected());
		assertEquals(true, y.isRightObject());

	}
	
	@Test
	public void testLitterer() {
		Position p = new Position(88, 88);
		Velocity v = new Velocity(10, 2);
		You y = new You(p, v);
		Litter x1 = new Litter(p, v, 1);
		Litter x2 = new Litter(p, v, 0);
		Litterer l = new Litterer(0, x1);
		
		l.setL(x2);
		assertEquals(0, l.getType());
		l.setType(1);
		assertEquals(1, l.getType());
	}

	@Test
	public void testLitterers() {
		Position p = new Position(88, 88);
		Velocity v = new Velocity(10, 2);
		You y = new You(p, v);
		Litter x1 = new Litter(p, v, 1);
		Litterer l1 = new Litterer(0, x1);
		Litterer l2 = new Litterer(1, x1);
		
		ArrayList<Litterer> lits = new ArrayList<Litterer>();
		lits.add(l1);
		lits.add(l2);
		
		Litterers litterers = new Litterers(lits);
		
		x1.setWasCollected(true);
		
		assertEquals(true, litterers.shouldBeRemoved(l1));
		
		
	}
}
