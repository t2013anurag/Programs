import java.io.*;

class rftest
	{
	public static void main(String args[])
	{
	RandomAccessFile f = new RansomAccessFile("chk.txt","rw");
	f.seek(2);
