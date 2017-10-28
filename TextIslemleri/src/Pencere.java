import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pencere extends JPanel implements MouseListener, ActionListener
{

	JLabel label1,label2;
	JButton button1,button2;
	JTextField textField1;
	int sayi=0;
	Pencere()
	{
		super();
		addMouseListener(this);

		label1 = new JLabel("Karesi Bulunacak Sayý:");
		label2 = new JLabel( "Sonuç :" + sayi);
		button1 = new JButton("Sýfýrla");
		button2 = new JButton("Karesini Al");
		textField1 = new JTextField(10);
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		add(label1);
		add(textField1);
		add(label2);
		add(button1);
		add(button2);
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Sýfýrla") )
		{
			sayi=0;
			label2.setText( "Sonuç :" + sayi);
			textField1.setText("");
		}else if( e.getActionCommand().equals("Karesini Al") )
		{
			if( textField1.getText().length() > 0 )
			{
				sayi=Integer.parseInt( textField1.getText() );
				label2.setText( "Sonuç :" + sayi * sayi);
				
			}
		}
	}
	
}
