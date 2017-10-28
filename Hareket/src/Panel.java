import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener 
{

	Dortgen a;
	Dortgen[] digerleri;
	int hiz=4, blokSayisi=5;
	
	public Panel()
	{
		super();
		
		//addKeyListener( this);
		
		a = new Dortgen( 320, 240, 20,40);
		
		digerleri = new Dortgen[10];
		digerleri[0]= new Dortgen ( 10, 20, 20, 45);
		digerleri[1]= new Dortgen ( 50, 55, 6, 15);
		digerleri[2]= new Dortgen ( 260, 100, 20, 80);
		digerleri[3]= new Dortgen ( 200, 10, 20, 80);
		digerleri[4]= new Dortgen ( 160, 300, 20, 80);
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		a.ekranCiz(g);
		g.drawRect( 0, 0, 624, 441);
		for( int i = 0; i < blokSayisi; i++)
		{
			digerleri[i].ekranCiz(g);
		}
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if( e.getKeyCode() == e.VK_UP){
			a.hareketEt(0, -hiz, digerleri, blokSayisi);
			repaint();
		}else if( e.getKeyCode() == e.VK_DOWN){
			a.hareketEt(0, hiz, digerleri, blokSayisi);
			repaint();
		}else if( e.getKeyCode() == e.VK_LEFT){
			a.hareketEt(-hiz, 0, digerleri, blokSayisi);
			repaint();
		}else if( e.getKeyCode() == e.VK_RIGHT){
			a.hareketEt(hiz, 0, digerleri, blokSayisi);
			repaint();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
