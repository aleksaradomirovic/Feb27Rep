package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer cap = new Timer(1000/60, this);
	static final int EDITOR = 0;
	int status = EDITOR;
	EnvironmentManager e = new EnvironmentManager(this);
	
	void startTimer() {
		e.startEditor();
		cap.start();
	}
	
	void updateEditor() {
		e.updateEditor();
	}
	
	void drawEditor(Graphics g) {
		e.drawEditor(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if(status == EDITOR) {
			updateEditor();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if(status == EDITOR) {
			drawEditor(g);
		}
	}
}
