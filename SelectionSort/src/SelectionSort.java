import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
	
		Random rnd = new Random();
		
		Array sayiListesi=new Array(10);
		for(int i = 0 ; i<10;i++)
		{
			
			sayiListesi.sonaEkle(rnd.nextInt(100));
		}
		sayiListesi.yaz();
		sayiListesi.selectionSort();
		
		System.out.println();
		System.out.println("Yeni Liste:");
	
		sayiListesi.yaz();
		System.out.println("En büyük sayý:"+sayiListesi.Max());	
		sayiListesi.sil();

	}
}
