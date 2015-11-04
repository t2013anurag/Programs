import java.net.*;
import java.io.*;

class areaserv
	{
	public static void main(String args[]) throws IOException
	{
	ServerSocket ss = new ServerSocket(12300);
        System.out.println("Server Started and listening to the port 12345");

	Socket skt = ss.accept();
	BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
	String s = br.readLine();
	System.out.println("Received "+ s);
	float f = Float.parseFloat(s);
	double area = 3.14* f*f;
	System.out.println("sending "+ area);
	PrintWriter pr = new PrintWriter(skt.getOutputStream());
		
	pr.print(area+"\n"); 
	pr.flush();

	skt.close();
	ss.close();
	}
	}	
