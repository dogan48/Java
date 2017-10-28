import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Pencere extends JFrame implements MouseListener {
	private int x1, y1, x2, y2, x3, y3;
	 Graphics ciz;
	 public Pencere()
	 {
		addMouseListener(this);
	 }
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
		x3=x2-x1;
		y3=y2-y1;
		if(x3<0)
			x3=-x3;
		if(y3<0)
			y3=-y3;
		g.drawRect(x1, y1, x3, y3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub


		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x1=e.getX();
		y1=e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2=e.getX();
		y2=e.getY();
		
		repaint();
		
	}

}
