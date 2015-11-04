import java.io.*;
class rnd1
	{
	public static void main(String args[]) throws IOException
	{
	RandomAccessFile rf = new RandomAccessFile("rd.txt","rw");
	rf.seek(20);
	System.out.println(rf.readInt());

	rf.close();
	
	
	}
	}