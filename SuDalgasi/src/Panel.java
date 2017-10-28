import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	Timer zaman;
	Cember[] cemberler;
	int cemberMevcut=0, cemberMax=5, cemberSay=0, artis=2;
	public Panel()
	{
		super(); 
		
		addMouseListener(this);
		addKeyListener( this);
		cemberler=new Cember[cemberMax];
		
		zaman = new Timer( 40, this);
		zaman.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
		super.paintComponent(g);
			for(int i = 0; i < cemberSay; i++)
				cemberler[i].cemberCiz(g);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
			Cember yeniCember= new Cember(e.getX(),e.getY(),0);
			
			cemberler[cemberMevcut]=yeniCember;
			cemberMevcut = (cemberMevcut + 1) % cemberMax;
			
			if( cemberSay < cemberMax)
				cemberSay = cemberSay + 1;

		
		
	}	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i < cemberSay; i++)
			cemberler[i].genisle(artis);
		repaint();
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		zaman.start();
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		zaman.stop();
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if( e.getKeyCode() == e.VK_UP)
			artis++;
		else if ( e.getKeyCode() == e.VK_DOWN)
			artis--;
		
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
