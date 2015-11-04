class thrd
	{
	public static void main(String args[])
	{
	thtest t1 = new thtest(1,"t1");
	thtest t2 = new thtest(10,"t2");
	
	
	try
	{
	for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " x  5 = " + i *5);
		Thread.sleep(1000);
		}
	}
	catch(InterruptedException e)
		{
		System.out.println(e);
		}
	
	boolean a = t1.t.isAlive();
	System.out.println("Child is alive or not " + a);
	System.out.println("MAin thread exit");
	}
	}

class thtest implements Runnable
	{
	Thread t;
	thtest(int p , String s) 
		{ 	
		t = new Thread(this,"Child");
		t.setPriority(p);
		t.setName(s);
		t.start();
		}
	public void run()
		{
		try
		{
		for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " +  5 = " + (i +5) + t.getName());
		Thread.sleep(1000);
		}
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
		}
		System.out.println("Child thread exit");
		}
	}
					