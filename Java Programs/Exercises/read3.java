import java.io.*;

class read3
	{
	public static void main(String args[]) throws IOException
	{
	FileInputStream i = new FileInputStream("ex1.java");
	FileOutputStream b = new FileOutputStream("xyz.java");
	int c;
	while (( c = i.read()) != -1)
	b.write(c);
	i.close();
	b.close();
	}
	}