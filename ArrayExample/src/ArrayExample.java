import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] a;
		System.out.print("Ka� say� gireceksin:");
		int sayi=scn.nextInt();
		a=new int[sayi];
		
		for(int x=0;x<sayi;x++)
		{
			System.out.print((x+1)+".sayiyi gir:");
			a[x]=scn.nextInt();
		}
		
		System.out.print("Girdi�in Say�lar:");
		for(int x=0;x<sayi;x++)
		{
			System.out.print(a[x] + "  ");
		}
	}

}
