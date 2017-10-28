
public class Insan 
{

	private String tc;
	private String isim;
	private String soyisim;
	private int yas;
	
	public Insan() 
	{
		setTc("Tc Yok");
		setIsim("Ýsim Yok");
		setSoyisim("Soyisim Yok");
		setYas(0);
	}
	public Insan(String tc,String isim,String soyisim,int yas) 
	{
		setTc(tc);
		setIsim(isim);
		setSoyisim(soyisim);
		setYas(yas);
	}
	public void biriniSelamla(Insan gelenInsan)
	{
		System.out.println("Merhaba " + gelenInsan.getIsim() + ", Ben " + this.getIsim() + ".");
	}
	
	public void bilgileriYaz()
	{
		System.out.println(tc + " " + isim + " " + soyisim + " " + yas);
	}
	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}
