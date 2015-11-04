import java.io.*;

class read2
	{
	public static void main(String args[]) throws IOException
	{


	FileReader i = new FileReader("ex2.java");
	FileWriter b = new FileWriter("ex2cpy.java");
	int c;
while (( c = i.read()) != -1)
	b.write(c);
	i.close();
	b.close();
	}
	}