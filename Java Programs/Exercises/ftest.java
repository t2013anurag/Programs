import java.io.*;

class ftest 
	{
	public static void main(String args[]) throws IOException, FileNotFoundException
	{
	FileInputStream fin = new FileInputStream("str.java");int ch;
	FileOutputStream fout = new FileOutputStream("strdup.java");

	while ((ch = fin.read()) != -1)
		{
		
		if (ch != -1) fout.write(ch);
		}
	}
	}
		