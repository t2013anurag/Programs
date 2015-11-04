import java.io.*;
import java.net.*;


public class udps {
	public static void main(String[] args) throws Exception
	 {
	  DatagramSocket sk = new DatagramSocket(12000);
     	  byte[] buf = new byte[1000];
	  InetAddress ipadd = InetAddress.getByName("localhost");
  	  DatagramPacket out = new DatagramPacket(buf, buf.length, ipadd, 12000); 
	  String msg = "This is UDP packet,  Hello Clinet";		
	  System.out.println("Server started");
	  System.out.println("Sending message ");
	  while (true)
	  {
	  buf = ("Server say: " + msg).getBytes();

          sk.send(out);
	  }
     	}
	}