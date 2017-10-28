import java.awt.Graphics;
import java.awt.Rectangle;

public class Dortgen {
	Rectangle r;
	
	public Dortgen( int x, int y, int width, int height)
	{
		r= new Rectangle( x, y, width, height);
		
	
	}

	public void ekranCiz(Graphics g)
	{
		g.drawRect( (int)r.getX(), (int)r.getY(), (int)r.getWidth(), (int)r.getHeight());
	}
	public void hareketEt( int x, int y, Dortgen[] digerleri, int sayisi)
	{
		Rectangle gecici = new Rectangle(r);
		boolean cakisma=false;
		gecici.setLocation( (int)r.getX() + x, (int)r.getY() + y );
		
		for(int i = 0; i < sayisi; i++ )
		{
			if(gecici.intersects(digerleri[i].getR()))
			{
				cakisma=true;
			}
			
		}
		if( gecici.getX() < 0 || gecici.getY() < 0
				|| gecici.getX() > 604 || gecici.getY() > 400)
		{
			cakisma=true;
		}
		if(!cakisma)
		{
			r.setLocation( (int)r.getX() + x, (int)r.getY() + y );

		}	
		
	}

	public Rectangle getR() {
		return r;
	}
	
}
