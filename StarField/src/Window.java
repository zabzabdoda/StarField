import java.util.ArrayList;

import processing.core.PApplet;

public class Window extends PApplet{

	private ArrayList<Layer> layers;
	
	public Window() {
		layers = new ArrayList<Layer>();
		layers.add(new Layer(10000,3));
		layers.add(new Layer(10000,1));
		layers.add(new Layer(10000,0.5f));
	}
	
	public void draw() {
		background(0);
		for(Layer l : layers) {
			l.draw(this);
			System.out.println(mouseX-this.width/2);
			l.move(mouseX-this.width/2, mouseY-this.height/2);

		}
	}
	
	@Override
	public void mouseMoved() {
		for(Layer l : layers) {
		}
	}
	
	
}
