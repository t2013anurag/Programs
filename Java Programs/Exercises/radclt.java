import java.net.*;
import java.io.*;

class radclt
	{
	static Socket sk ;
	
	static PrintWriter pr;

	public static void main(String args[]) throws IOException, UnknownHostException
	{
	sk = new Socket("localhost",12300);
	
	pr = new PrintWriter(new OutputStreamWriter(sk.getOutputStream()));
	BufferedReader br1 = new BufferedReader(new InputStreamReader(sk.getInputStream()));
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the radius ");
	String rad = br.readLine()+"\n";
	System.out.println("Sending " + rad); 
	pr.write(rad);
	pr.flush();
	String s = br1.readLine();
	System.out.println("Received Area = "+ s); 
	
	
	
	sk.close();
	}
	}	