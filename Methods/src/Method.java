import java.util.Scanner;

public class Method {
	public static void main(String args[]){
		int g1,g2,g3,g4;
		Scanner scan= new Scanner(System.in);
		System.out.println("1.noktanin x de�erini giriniz:");
		g1=scan.nextInt();
		System.out.println("1.noktanin y de�erini giriniz:");
		g2=scan.nextInt();
		System.out.println("2.noktanin x de�erini giriniz:");
		g3=scan.nextInt();
		System.out.println("2.noktanin y de�erini giriniz:");
		g4=scan.nextInt();
		
		System.out.print(mesafe(g1,g2,g3,g4));
	}
	public static double mesafe(int x1, int x2,int x3,int x4){
		return Math.sqrt(((x3-x1)*(x3-x1))+((x4-x2)*(x4-x2)));
		
	
	}
	
}
