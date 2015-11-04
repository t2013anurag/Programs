import java.io.*;



class buf
	{
	public static void main(String args[]) throws IOException
	{

	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter first no");
	int n1 = Integer.parseInt(b.readLine());
	System.out.println("Enter second no");
	int n2 = Integer.parseInt(b.readLine());
	System.out.println(n1 + "*" + n2 + "=" + n1*n2);  

	}
	}
