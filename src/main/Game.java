package main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
	JFrame frame = new JFrame();
	GamePanel panel = new GamePanel();
	
	public static final int w = 800, h = 600;
	
	void setup() {
		frame.add(panel);
		frame.addMouseMotionListener(panel.e.editor);
		frame.addMouseListener(panel.e.editor);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800,600));
		
		panel.startTimer();
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Game().setup();
	}
}
