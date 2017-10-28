import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Array sayiListesi=new Array(10);
		for(int i = 0 ; i<10;i++)
		{
			
			sayiListesi.sonaEkle(rnd.nextInt(100));
		}
		sayiListesi.yaz();
		sayiListesi.bubbleSort2();
		System.out.println();
		System.out.println("Yeni Liste:");
		sayiListesi.yaz();

	}
}