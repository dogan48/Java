import java.awt.Color;
import java.awt.Graphics;

public class Cember {
	int x,y;
	int cap;
	Color c;
	
	public Cember(int x, int y, int cap) {
		super();
		this.x = x;
		this.y = y;
		this.cap = cap;
	}

	public void cemberCiz(Graphics g)
	{
		g.setColor(c.BLUE);
		g.drawOval(x,y,cap,cap);
	}
	
	public void genisle(int artis)
	{
		x = x - (artis / 2);
		y = y - (artis / 2);
		
		cap = cap + artis;
		
	}
}
