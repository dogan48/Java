import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener {

	
	FileReader dosyaOkuyucu;
	BufferedReader okuyucu;	
	
	
	FileWriter dosyaYazici;
	BufferedWriter yazici;	
	
	Ogrenci[] ogrenciler = new Ogrenci[50];
	int satirSayisi=0;
	String okunan;
	JLabel noLabel, adLabel, sinifLabel;
	JTextField noTextField, adTextField, sinifTextField;
	JButton button1, button2;

	
	public Panel() {
		
		noLabel = new JLabel("No: ");
		adLabel = new JLabel("Ad Soyad: ");
		sinifLabel = new JLabel("Sýnýf: ");
		
		noTextField = new JTextField(10);
		adTextField = new JTextField(20);
		sinifTextField = new JTextField(10);
		
		button1 = new JButton("EKLE");
		button1.addActionListener(this);
		

		button2 = new JButton("TEMÝZLE");
		button2.addActionListener(this);
		
		add(noLabel);
		add(noTextField);
		add(adLabel);
		add(adTextField);
		add(sinifLabel);
		add(sinifTextField);
		add(button2);
		add(button1);
		
		try
		{
			dosyaOkuyucu = new FileReader("D:\\liste.txt");
			okuyucu = new BufferedReader(dosyaOkuyucu);
			if( okuyucu.ready() )
			{
				okunan = okuyucu.readLine() ;

				while(okunan != null)
				{
					ogrenciler[satirSayisi] = new Ogrenci( satirSayisi, okunan, okuyucu.readLine(), okuyucu.readLine() );
					satirSayisi++;
					okunan=okuyucu.readLine();
				}
			}

			okuyucu.close();
			dosyaOkuyucu.close();
	
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
	
	
	}

	public void ogrenciKaydet(String no, String adSoyad, String sinif)
	{
		File dosya = new File("D:\\yeniListe.txt");
		try {
			if(!dosya.exists())
			{
				dosya.createNewFile();
			}
			
			dosyaYazici = new FileWriter(dosya);
			yazici = new BufferedWriter(dosyaYazici);
			
			
			yazici.write(no);
			yazici.newLine();
			yazici.write(adSoyad);
			yazici.newLine();
			yazici.write(sinif);
					
			yazici.close();
			dosyaYazici.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if( e.getActionCommand().equals("EKLE") )
		{
			ogrenciKaydet(noTextField.getText(), adTextField.getText(), sinifTextField.getText());
		}
		
		if( e.getActionCommand().equals("TEMÝZLE") )
		{
			noTextField.setText("");
			adTextField.setText("");
			sinifTextField.setText("");
			
		}
	}

}
