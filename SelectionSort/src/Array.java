import java.util.Scanner;

public class Array {
	private int listeUzunlugu;//3
	private int elemanSayisi;//0-2
	private int[] eleman;
	Scanner scn = new Scanner(System.in);
	public Array(int listeElemanSayisi)
	{
		eleman=new int[listeElemanSayisi];
		listeUzunlugu=listeElemanSayisi;
		elemanSayisi=0;
		
	}
	public void sonaEkle(int eklenecek)
	{
		if(elemanSayisi<listeUzunlugu)
		{
			eleman[elemanSayisi]=eklenecek;
			elemanSayisi++;
			
		}
		else
		{
			System.out.println("Liste Doldu Ekleme Yapýlamaz...");
		}
	}
	public void yaz()
	{
		for(int i=0;i<elemanSayisi;i++)
		{
			System.out.print(eleman[i]+" ");
		}
		System.out.println();
	
	}
	public void sil()
	{
		System.out.println();
		System.out.println("Mevcut liste:");
		yaz();
		
		System.out.print("Silinecek elemanýn indexini giriniz:");
		
		int silinecek=scn.nextInt();
		if(silinecek<elemanSayisi && silinecek>=0 )
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
				System.out.println("Liste boþ!");
			}
		
		}
		else
		{
			System.out.println("Yanlýþ index!");
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
			int eklenecek=scn.nextInt();
			
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
				System.out.println("Liste Doldu Ekleme Yapýlamaz!");
			}
		}
		else
		{
			System.out.println("Yanlýþ index!");
			ekle();
		}
		
	}
	public int Max()
	{
		int enBuyuk=eleman[0];
		for(int i=1;i<elemanSayisi;i++)
		{
			if(eleman[i]>enBuyuk)
			{
				enBuyuk=eleman[i];
			}
		}
		
		return enBuyuk;
	}
	public int Min()
	{
		int enKucuk=eleman[0];
		for(int i=1;i<elemanSayisi;i++)
		{
			if(eleman[i]<enKucuk)
			{
				enKucuk=eleman[i];
			}
		}
		
		return enKucuk;
	}
	public void ara()
	{
		System.out.println("Aradýðýnýz elemanýn adýný yazýnýz:");
		int aranacak=scn.nextInt();
		int arananIndex=-1;
		for(int i=0;i<elemanSayisi;i++)
		{
			if(eleman[i]==aranacak)
			{
				arananIndex=i;
				System.out.println("Aradðýnýz eleman "+ arananIndex + ". indexte bulundu.");
			}
		}
		if(arananIndex<0)
		{
			System.out.println("Aradýðýnýz eleman bulunamadý!");
		}
	}
	public void swap(int i1,int i2)
	{
		int temp=eleman[i1];
		eleman[i1]=eleman[i2];
		eleman[i2]=temp;
	}
	public void selectionSort()
	{
		
		int enKucukIndex;
		for(int i=0;i<elemanSayisi;i++)
		{
			enKucukIndex=i;
			for(int j=i;j<elemanSayisi;j++)
			{
				if(eleman[j]<eleman[enKucukIndex])
				{
					enKucukIndex=j;
				}
			}
			swap(enKucukIndex,i);
		
			
		}
		
	}
}
