import java.util.Scanner;

public class DogumGunu {

	public static void main(String[] args) {
		
		int ay=0, gun=0;
		Scanner scan = new Scanner( System.in);
		
		System.out.println("Gün ve Ay giriniz:"); 
		gun = scan.nextInt(); 
		ay = scan.nextInt();
		
		if(gun == 24 && ay ==7)
			for(int i = 1; i<=61; i++)
				System.out.println("Bizim Tayfa olarak "
						+ "Ali Kemal Özkan'ýn doðum gününü kutlarýz!!!");
		else
			System.out.println("Yok Birþey...");
	}
}
