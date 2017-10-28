
public class Kullanici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karakter k1= new Karakter(1,"dogan", "123456", 10, "dogan48");
		Karakter k2= new Karakter(2,"hadi", "456789", 12, "hadi48");
		k1.bilgiYaz();
		k2.bilgiYaz();
		k1.levelUp();
		k2.levelDown();
		k1.bilgiYaz();
		k2.bilgiYaz();

	}

}
