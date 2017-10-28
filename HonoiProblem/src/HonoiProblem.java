
public class HonoiProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honoi(4,'a','b','c');

	}
	
	public static void honoi(int n, char x, char y, char z) {
		if(n==1) {
			System.out.println("Diski "+x+"'den "+z+"'ye taþý.");
		}
		else {
			honoi(n-1,x,z,y);
			honoi(1,x,y,z);
			honoi(n-1,y,x,z);
		}

	}
}
