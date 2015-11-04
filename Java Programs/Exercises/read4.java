import java.io.*;

class read4
	{
	public static void main(String args[]) throws IOException
	{
	FileInputStream i = new FileInputStream("thread2.java");
//	FileOutputStream b = new FileOutputStream("thread2cpy.java");
	int c;
	while (( c = i.read()) != -1)
System.out.print((char)c);
	i.close();
//	b.close();
	}
	}