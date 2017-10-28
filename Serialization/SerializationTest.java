import java.io.*;

public class SerializationTest{
	
	public static void main(String[] args){
		Data d1 =  new Data("Hadi","Bakalim",24);
		SerializeObject(d1);
		deSerializeObject();
	}
	public static void deSerializeObject(){
		try{
			Data d;
			FileInputStream fIn = new FileInputStream("data.out");
			ObjectInputStream in = new ObjectInputStream(fIn);
			d=(Data)in.readObject();
			System.out.println("Data Of Object");
			System.out.println(d.getName() + " " + d.getSurname() + " " + d.getAge());
			fIn.close();
		}catch(Exception e){
			System.out.println("Error in serializition process!");
			e.printStackTrace();
		}
	}
	public static void SerializeObject(Data d){
		try{
			
			FileOutputStream fOut = new FileOutputStream("data.out");
			ObjectOutputStream out = new ObjectOutputStream(fOut);
			out.writeObject(d);
			out.close();
		}catch(Exception e){
			System.out.println("Error in serializition process!");
			e.printStackTrace();
		}
	}


}
