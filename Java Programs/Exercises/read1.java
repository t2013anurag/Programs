import java.io.*;

class read1
	{
	public static void main(String args[]) throws IOException
	{
	InputStreamReader i = new InputStreamReader(System.in);
	BufferedReader b = new BufferedReader(i);
	System.out.println("Enter a string and a no");
	String s = b.readLine();

	int s1 = Integer.parseInt(b.readLine());
	char c = (char)b.read();
	System.out.println( s + s1+ "c "+c);
	}
	}