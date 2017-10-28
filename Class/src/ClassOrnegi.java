/**
 * @author Dogan
 *
 */


public class ClassOrnegi {
	
	public static void main(String[] args) {
	Insan i1 = new Insan();
	Insan i2 = new Insan("01234567898","Ali","Osman",23);
	i1.bilgileriYaz();
	i2.bilgileriYaz();
	i1.setTc("01234567896");
	i1.setIsim("Ayþe");
	i1.setSoyisim("Fatma");
	i1.setYas(24);
	System.out.println("___________________________________");
	System.out.println();
	i1.bilgileriYaz();
	i2.bilgileriYaz();
	System.out.println();
	i1.biriniSelamla(i2);
	}

}
