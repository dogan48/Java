import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Bir Sayi Gir:");
		int giris=scn.nextInt();
		System.out.println();
		
		for(int i=0;i<=giris;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=giris;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		
	}

}
