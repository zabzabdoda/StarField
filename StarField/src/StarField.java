import java.awt.Dimension;

import javax.swing.JFrame;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

public class StarField {

	public static void main(String[] args) {
		
		Window window = new Window();
		PApplet.runSketch(new String[] { "" }, window);
		PSurfaceAWT surf = (PSurfaceAWT) window.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame javaWindow = (JFrame) canvas.getFrame();
		//JFrame javaWindow = new JFrame();
		javaWindow.setSize(717, 740);
		javaWindow.setMinimumSize(new Dimension(100, 100));
		javaWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		javaWindow.setResizable(true);
		javaWindow.setExtendedState(javaWindow.getExtendedState()|JFrame.NORMAL);
		javaWindow.getContentPane().setLayout(null);
		javaWindow.setVisible(true);
		canvas.requestFocus();

	}
}
