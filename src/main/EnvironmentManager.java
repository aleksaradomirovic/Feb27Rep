package main;

import java.awt.Graphics;

public class EnvironmentManager {
	GamePanel game;
	Editor editor = new Editor(this);
	
	Terrain[][] terrain = new Terrain[Game.h][Game.w];
	double[] defaultVars = new double[] {0};
	public EnvironmentManager(GamePanel p) {
		game = p;
	}
	
	void startEditor() {
		//generate Terrain
		for(int i = 0; i < Game.h; i++) {
			for(int j = 0; j < Game.w; j++) {
				terrain[i][j] = new Terrain(j,i,defaultVars);
			}
		}
	}
	
	void updateEditor() {
		for(int i = 0; i < Game.h; i++) {
			for(int j = 0; j < Game.w; j++) {
				terrain[i][j].update();
			}
		}
		editor.update();
	}
	
	void drawEditor(Graphics g) {
		for(int i = 0; i < Game.h; i++) {
			for(int j = 0; j < Game.w; j++) {
				terrain[i][j].draw(g);
			}
		}
		editor.draw(g);
	}
	
	void changeEditorHeight() {
		for(int i = 0; i < Game.h; i++) {
			for(int j = 0; j < Game.w; j++) {
				terrain[i][j].changeHeight(1, editor.mouseX-25, editor.mouseY-50, 25);
			}
		}
	}
}
