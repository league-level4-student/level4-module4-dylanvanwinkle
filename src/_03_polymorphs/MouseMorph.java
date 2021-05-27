package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MouseMorph extends Polymorph{
	protected int width = 50;
	protected int height = 50;
	MouseMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}
	
    public void update(){

    }

}
