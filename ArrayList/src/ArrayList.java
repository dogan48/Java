
public class ArrayList {

	public static void main(String[] args) {
		List yeniListe= new List(5);
		yeniListe.sonaEkle("Ekmek");
		yeniListe.sonaEkle("Su");
		yeniListe.sonaEkle("Peynir");
		yeniListe.yaz();
		System.out.println("En buyuk eleman "+yeniListe.Max());
		System.out.println("En kuçuk eleman "+yeniListe.Min());
		yeniListe.ekle();
		yeniListe.ara();
	}

}
