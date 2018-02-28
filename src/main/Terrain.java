package main;

import java.awt.Color;
import java.awt.Graphics;

public class Terrain {
	int x,y;
	double[] vars;
	static final int heightmax = 30, heightmin = 0;
	
	public Terrain(int x, int y, double[] vars) {
		this.x = x;
		this.y = y;
		this.vars = vars;
	}
	
	void draw(Graphics g) {
		if(vars[0] < heightmin )
			vars[0] = heightmin;
		
		if(vars[0] > heightmax)
			vars[0] = heightmax;
		g.setColor(new Color((int)vars[0]*5,125,0));
		g.drawRect(x, y, 1, 1);
	}
	
	void update() {
	}
	
	void changeHeight(int value, int x, int y, int range) {
		System.out.println("X:"+(x-this.x));
		System.out.println("Y:"+(y-this.y));
		if(Math.hypot(Math.abs(x-this.x), Math.abs(y-this.y)) < range) {
			vars[0] += value;
		}
	}
}
