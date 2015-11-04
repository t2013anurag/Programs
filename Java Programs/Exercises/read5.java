import java.io.*;

class read5
	{
	public static void main(String args[]) throws IOException
	{
	FileReader i = new FileReader("thread3.java");
	FileWriter b = new FileWriter("thread3cpy.java");
	BufferedReader br = new BufferedReader(i);
	PrintWriter pr = new PrintWriter(b);

	String s;
	while (( s = br.readLine()) != null)
	pr.println(s);

	i.close();
	b.close();
	}
	}