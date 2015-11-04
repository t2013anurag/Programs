import java.net.*;
import java.io.*;
class net
	{
	public static void main(String args[]) throws UnknownHostException
	{
	InetAddress i = InetAddress.getByName("vit.ac.in");
	
	System.out.println("Host name " + i.getHostName());
	System.out.println("Host Address" + i.getHostAddress());
	System.out.println("Local Host " + i.getLocalHost());
	}
	}