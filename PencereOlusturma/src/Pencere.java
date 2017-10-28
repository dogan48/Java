import java.awt.Graphics;

import javax.swing.JFrame;

public class Pencere extends JFrame {

	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawRect(170, 90, 300, 300);
		
		g.drawLine(170, 90, 245, 165);
		g.drawLine(470, 90, 395, 165);
		
		g.drawRect(245,165 , 150, 150);
		
		g.drawLine(245, 315, 170, 390);
		g.drawLine(395, 315, 470, 390);
		
	}
}
