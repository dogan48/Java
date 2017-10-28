
public class Ogrenci {
	int id;
	String okulNo, adSoyad, sinif;
	
	public Ogrenci(int id, String okulNo, String adSoyad, String sinif) {
		this.id = id;
		this.okulNo = okulNo;
		this.adSoyad = adSoyad;
		this.sinif = sinif;
	}
	public void yaz()
	{
		System.out.println( id + " " + okulNo + " " + adSoyad + " " + sinif );
	}
	
}
