package Controller;
import Model.BeachGame;
import View.BeachView;

public class BeachActivity extends Activity {

	//BeachView beachview;
	BeachGame beachgame;
	
	public BeachActivity(BeachGame g){
		this.beachgame = g;
	}
	
//	public BeachView getBeachview() {
//		return beachview;
//	}

//	public void setBeachview(BeachView beachview) {
//		this.beachview = beachview;
//	}

	public BeachGame getBeachgame() {
		return beachgame;
	}

	public void setBeachgame(BeachGame beachgame) {
		this.beachgame = beachgame;
	}

	public void startGame() {
		
	}
	
}
