package Other;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Controller.BeachActivity;
import Controller.BeachUser;
import Model.BeachGame;
import View.BeachView;

public class Main {
	
	
	
	public static void main(String[] args) {
		BeachActivity ba = new BeachActivity(BeachGame.makeGame());
		BeachView bv = new BeachView(ba);
		bv.addMouseListener(new BeachUser());
		bv.start();
	}

}
