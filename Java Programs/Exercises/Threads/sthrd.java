class sthrd
	{
	public static void main(String args[])
	{
	syn s = new syn();	
	thtest t1 = new thtest(s, "Somebody");
	thtest t2 = new thtest(s, "Nobody");
	thtest t3 = new thtest(s, "Everybody");
	}
	}

class thtest implements Runnable
	{
	Thread t;
	String msg;
	syn sy; 
	thtest(syn s1,  String s) 
		{ 	
		sy = s1;
		msg = s;
		t = new Thread(this,"Child");

		t.start();
		}
	public void run()
		{
		sy.callme(msg);
		}
	}
			
class syn
	{
	synchronized void callme(String m)
	{
	System.out.println("[ " );
	System.out.println(m);
	System.out.println(" ] " );
	} }