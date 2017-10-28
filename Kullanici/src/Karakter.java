
public class Karakter extends KullaniciBilgileri implements karakterOzellikleri {
	private int karakterSeviye;
	private String karakterAdi;
	public Karakter(int kId,String kAdi,String sifre ,int karakterSeviye,String karakterAdi) {
		super(kId,kAdi,sifre);
		this.karakterSeviye=karakterSeviye;
		this.karakterAdi=karakterAdi;
	}
	public int getKarakterSeviye() {
		return karakterSeviye;
	}
	public void setKarakterSeviye(int karakterSeviye) {
		this.karakterSeviye = karakterSeviye;
	}
	public String getKarakterAdi() {
		return karakterAdi;
	}
	public void setKarakterAdi(String karakterAdi) {
		this.karakterAdi = karakterAdi;
	}
	@Override
	public void levelUp() {
		// TODO Auto-generated method stub
		setKarakterSeviye(getKarakterSeviye()+1);
		
	}
	@Override
	public void levelDown() {
		// TODO Auto-generated method stub
		setKarakterSeviye(getKarakterSeviye()-1);
		
		
	}
	@Override
	public void konus(String cumle) {
		// TODO Auto-generated method stub
		System.out.println(cumle);
		
	}
	@Override
	public void bilgiYaz() {
		// TODO Auto-generated method stub
		System.out.println("Kullanýcý Id: "+ getId()+" Kullanýcý Adý: "+getkAdi()+" Þifre: "+getSifre()+" Karakter Adý: "+getKarakterAdi()+" Karakter Seviye: "+getKarakterSeviye());
		
	}

}
