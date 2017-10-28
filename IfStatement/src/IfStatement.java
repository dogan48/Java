import java.util.Scanner;

public class IfStatement {
	public static void main(String args[]){
		int a,b;
		String islem;
		Scanner scan = new Scanner(System.in);
		System.out.print("1.sayiyi giriniz:");
		a=scan.nextInt();
		System.out.print("Yapacaðýnýz iþlemin sembolünü giriniz(orn: + - * / ) :");
		islem=scan.next();
		System.out.print("2.sayiyi giriniz:");
		b=scan.nextInt();
		
		if(islem.equals("+")){
			System.out.print( a + " + " + b + " = " + (a+b));
		}
		else{
			if(islem.equals("-")){
				System.out.print( a + " - " + b + " = " + (a-b));
			}
			else
				if(islem.equals("*")){
					System.out.print( a + " * " + b + " = " + (a*b));
				}
				else{
					System.out.print( a + " / " + b + " = " + (a/b));
				}
		}	
	}
}
