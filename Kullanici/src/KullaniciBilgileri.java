/**
 * 
 */

/**
 * @author Dogan
 *
 */
public abstract class KullaniciBilgileri {

	/**
	 * 
	 */
	private int kId;
	private String kAdi;
	private String sifre;
	
	public KullaniciBilgileri(int kId,String kAdi,String sifre) {
		// TODO Auto-generated constructor stub
		this.kId=kId;
		this.kAdi=kAdi;
		this.sifre=sifre;
		
	}

	public int getId() {
		return kId;
	}

	public void setId(int kId) {
		this.kId = kId;
	}

	public String getkAdi() {
		return kAdi;
	}

	public void setkAdi(String kAdi) {
		this.kAdi = kAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	

}
