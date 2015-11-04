import java.util.Scanner;
import java.io.*;


class input
	{
	public static void main(String args[]) throws IOException
	{
/*	Scanner s = new Scanner(System.in);
	
	System.out.println("Input first no");
	int no1 = s.nextInt();
	System.out.println("Input second no");
	int no2 = s.nextInt();
	System.out.println(no1 + "*" + no2 + "=" + no1*no2); 
	
	int n1 = Integer.parseInt(args[0]);
	int n2 = Integer.parseInt(args[1]);
	System.out.println(n1 + "*" + n2 + "=" + n1*n2+ args[2]);  */

	int c = System.in.read();
	int n1 = Character.getNumericValue(c);
	int c1 = System.in.read();
	int n2 = Character.getNumericValue(c1);
	System.out.println(n1 + "*" + n2 + "=" + n1*n2); 
/*
	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	int n1 = Integer.parseInt(b.readLine());
	int n2 = Integer.parseInt(b.readLine());
	System.out.println(n1 + "*" + n2 + "=" + n1*n2);  */

	}
	}
