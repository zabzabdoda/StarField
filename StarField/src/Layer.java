import java.util.HashSet;
import java.util.Random;

import processing.core.PApplet;

public class Layer {
	
	private HashSet<Star> stars;
	private float speedMod;
	
	public Layer(int numStars, float speedMod) {
		stars = new HashSet<Star>();
		this.speedMod = speedMod;
		Random r = new Random();
		for(int i = 0; i < numStars; i++) {
			stars.add(new Star(r.nextInt(10000)-5000,r.nextInt(10000)-5000));
		}
		
	}
	
	public void draw(PApplet p) {
		for(Star s : stars) {
			s.draw(p);
		}
	}
	
	public void move(int dirX, int dirY) {
		/*float dX, dY;
		if(dirX < 0) {
			dX = -2*speedMod;
		}else {
			dX = 2*speedMod;
		}
		if(dirY < 0) {
			dY = -2*speedMod;
		}else {
			dY = 2*speedMod;
		}*/
		for(Star s : stars) {
			s.move(dirX/100*-speedMod, dirY/100*-speedMod);
		}
	}
	
}
