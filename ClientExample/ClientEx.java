import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClientEx {

   public static void main(String [] args) {
      String serverName ="127.0.0.1"; //args[0];
      int port = 6066;//Integer.parseInt(args[1]);
	Scanner input = new Scanner(System.in);
      try {
         System.out.println("Connecting to " + serverName + " on port " + port);
         Socket client = new Socket(serverName, port);
         
         System.out.println("Just connected to " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         
         //out.writeUTF("Hello from " + client.getLocalSocketAddress());
	 String message =input.nextLine();
	 out.writeUTF(message + " from "+client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         
         System.out.println("Server says " + in.readUTF());
         client.close();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}
