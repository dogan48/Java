import java.util.Scanner;

public class DogumGunu {

	public static void main(String[] args) {
		
		int ay=0, gun=0;
		Scanner scan = new Scanner( System.in);
		
		System.out.println("G�n ve Ay giriniz:"); 
		gun = scan.nextInt(); 
		ay = scan.nextInt();
		
		if(gun == 24 && ay ==7)
			for(int i = 1; i<=61; i++)
				System.out.println("Bizim Tayfa olarak "
						+ "Ali Kemal �zkan'�n do�um g�n�n� kutlar�z!!!");
		else
			System.out.println("Yok Bir�ey...");
	}
}
