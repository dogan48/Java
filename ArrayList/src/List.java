import java.util.Scanner;

public class List {
	private int listeUzunlugu;//3
	private int elemanSayisi;//0-2
	private String[] eleman;
	Scanner scn = new Scanner(System.in);
	public List(int listeElemanSayisi)
	{
		eleman=new String[listeElemanSayisi];
		listeUzunlugu=listeElemanSayisi;
		elemanSayisi=0;
		
	}
	public void sonaEkle(String eklenecek)
	{
		if(elemanSayisi<listeUzunlugu)
		{
			eleman[elemanSayisi]=eklenecek;
			elemanSayisi++;
			
		}
		else
		{
			System.out.println("Liste Doldu Ekleme Yapılamaz...");
		}
	}
	public void yaz()
	{
		for(int i=0;i<elemanSayisi;i++)
		{
			System.out.println(i+" " + eleman[i]);
		}
	
	}
	public void sil()
	{
		System.out.println("Mevcut liste:");
		yaz();
		System.out.print("Silinecek elemanın indexini giriniz:");
		
		int silinecek=scn.nextInt();
		if(silinecek<=elemanSayisi && silinecek>=0 )
		{
			if(elemanSayisi>0)
			{
				for(int i = silinecek;i<elemanSayisi-1;i++)
				{
					eleman[i]=eleman[i+1];
				}
		
				elemanSayisi--;	
				System.out.println(silinecek+". indexteki eleman silindi.");
				System.out.println("Yeni liste:");
				yaz();
			}
			else
			{
				System.out.println("Liste boţ!");
			}
		
		}
		else
		{
			System.out.println("Yanlýţ index!");
			sil();
		}
	}
	public void ekle()
	{
		System.out.print("Eklenecek indexi giriniz:");
		int index=scn.nextInt();
		if(index<=elemanSayisi && index>=0 )
		{
			System.out.print("Eklenecek stringi giriniz:");
			String eklenecek=scn.next();
			
			if(elemanSayisi<listeUzunlugu)
			{
				for(int i = elemanSayisi;i>index;i--)
				{
					
				eleman[i]=eleman[i-1];
				
				}
				eleman[index]=eklenecek;
				elemanSayisi++;
				
			}
			else
			{
				System.out.println("Liste Doldu Ekleme Yapılamaz!");
			}
		}
		else
		{
			System.out.println("Yanlış index!");
			ekle();
		}
		
	}
	public String Max()
	{
		String enBuyuk=eleman[0];
		for(int i=1;i<elemanSayisi;i++)
		{
			if(eleman[i].compareToIgnoreCase(enBuyuk)>0)
			{
				enBuyuk=eleman[i];
			}
		}
		
		return enBuyuk;
	}
	public String Min()
	{
		String enKucuk=eleman[0];
		for(int i=1;i<elemanSayisi;i++)
		{
			if(eleman[i].compareToIgnoreCase(enKucuk)<0)
			{
				enKucuk=eleman[i];
			}
		}
		
		return enKucuk;
	}
	public void ara()
	{
		System.out.println("Aradığınız elemanın adını giriniz:");
		String aranacak=scn.next();
		int arananIndex=-1;
		for(int i=0;i<elemanSayisi;i++)
		{
			if(eleman[i].compareToIgnoreCase(aranacak)==0)
			{
				arananIndex=i;
				System.out.println("Aradığınız eleman "+ arananIndex + ". indexte bulundu.");
			}
		}
		if(arananIndex<0)
		{
			System.out.println("Aradığınız eleman bulunamadý!");
		}
	}
}
