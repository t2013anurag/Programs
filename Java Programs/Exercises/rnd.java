import java.io.*;
class rnd
	{
	public static void main(String args[]) throws IOException

	{
	RandomAccessFile rf = new RandomAccessFile("rd.txt","rw");
	for (int i = 0; i <10; i++)
	rf.writeInt(i*10);
	
	rf.seek(20); // prints the 6th number - 4 bytes int
	System.out.println("20th loc" + rf.readInt());
	
	rf.seek(40);
	rf.writeInt(1000);

	rf.seek(rf.length());
	rf.writeInt(999);	
	rf.seek(rf.length()-4);
	System.out.println("Last" + rf.readInt());
	rf.close();
	}
	}