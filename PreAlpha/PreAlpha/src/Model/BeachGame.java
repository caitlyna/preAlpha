package Model;

import java.util.ArrayList;

public class BeachGame extends Game {

	You player;
	Litterers lits;

	public BeachGame(int s, Timer t, You y, Litterers ls) {
		super(s, t);
		this.player = y;
		this.lits = ls;
	}

	public You getPlayer() {
		return player;
	}

	public void setPlayer(You player) {
		this.player = player;
	}

	public Litterers getLits() {
		return lits;
	}

	public void setLits(Litterers lits) {
		this.lits = lits;
	}
	
	

	public void onTick() {

		// update score
		for(int i = 0; i < lits.getLits().size(); i++) {
			if(player.collectRightObject(lits.getLits().get(i)))
					score++;
			if(player.collectWrongObject(lits.getLits().get(i)))
				score--;
		}
		player.onTick();
		lits.onTick();

		// check isEnd
		if(timer.isTimeUp())
			setEnd(true);
	}
	
	public static BeachGame makeGame(){
		You y = new You(new Position(BACKGROUND_WIDTH / 2 - 50, BACKGROUND_HEIGHT - 300), new Velocity(10, 1));
		ArrayList<Litterer> litlist = new ArrayList<Litterer>();
		Litterers l = new Litterers(litlist);
		Timer t = new Timer(100000, false);
		BeachGame bg = new BeachGame(0, t, y, l);
		
		return bg;
	}

}
