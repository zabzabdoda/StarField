import java.awt.Color;
import java.awt.geom.Point2D;

import processing.core.PApplet;

public class Star {
	
	private Point2D.Float position;
	private double size;
	
	public Star(float x, float y) {
		position = new Point2D.Float(x,y);
		size = 1;
	}
	
	public void draw(PApplet p) {
		p.fill(Color.WHITE.getRGB());
		p.circle(position.x, position.y,(float) (size * 5));
	}
	
	public void move(float x, float y) {
		position.setLocation(position.x+x, position.y+y);
	}
	
}
