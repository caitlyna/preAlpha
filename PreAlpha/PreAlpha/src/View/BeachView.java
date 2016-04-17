package View;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import Controller.BeachActivity;
import Controller.BeachUser;
import Model.Game;

public class BeachView extends JFrame{
	
	BeachActivity activity;
	
	public BeachView(BeachActivity a){
		this.activity = a;
		setBackground(Color.WHITE);
		setSize(Game.BACKGROUND_WIDTH, Game.BACKGROUND_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.addMouseListener(new BeachUser());
		this.setContentPane(panel);
		setVisible(true);

	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.blue);
		g.drawRect(activity.getBeachgame().getPlayer().getPosition().getX(), 
				activity.getBeachgame().getPlayer().getPosition().getY(), 100, 100);
	}
	
	public void start(){
		ActionListener al = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				activity.getBeachgame().onTick();
				repaint();
			}
		};
		Timer t = new Timer(200, al);
		t.setRepeats(true);
		t.start();
	}
	
	
	
	
	

}
