import java.util.*;
import java.io.*;

class fsc
	{
	public static void main(String args[]) throws FileNotFoundException
	{
	File f = new File("Ls.txt");
	Scanner s = new  Scanner(f);

	while (s.hasNext())
	{
	System.out.println(s.next());
	}
	}
	}
