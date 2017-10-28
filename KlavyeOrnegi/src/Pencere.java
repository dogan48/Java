import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Pencere extends JFrame implements KeyListener {
	private String x="";
	 public Pencere()
	 {
		addKeyListener(this);
	 }
	
	public void paint(Graphics g) {
		super.paint(g);
	
		g.setColor(Color.RED);
		g.drawString(x, 300, 200);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		/*
		if(e.getKeyCode()==e.VK_BACK_SPACE && x.length()>0)
		{
			x = x.substring(0,x.length()-1);
		}else if(e.getKeyCode()==e.VK_ALPHANUMERIC)
		{
			x += e.getKeyChar();
		}
		*/
		x="ASCII : " + e.getKeyCode();
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	
	}

	

}
