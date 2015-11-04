class thread3
	{
	public static void main(String args[])
	{
	thtest t1 = new thtest("t1");
	thtest1 t2 = new thtest1("t2");
	
	
	try
	{
	for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " x  5 = " + i *5);
		Thread.sleep(10);
		}
	}
	catch(InterruptedException e)
		{
		System.out.println(e);
		}
	
	
	System.out.println("MAin thread exit");
	}
	}

class thtest implements Runnable
	{
	Thread t;
	thtest(String s) 
		{ 	
		t = new Thread(this);
		t.setPriority(10);
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
	
class thtest1 implements Runnable
	{
	Thread t;
	thtest1(String s) 
		{ 	
		t = new Thread(this);
		t.setPriority(1);
		t.setName(s);
		t.start();
		}
	public void run()
		{
		try
		{
		for (int i = 1000; i> 10; i/=10)
		{
		System.out.println(i + " /  10 = " + (i /10) + t.getName());
		Thread.sleep(10000);
		}
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
		}
		System.out.println("Child thread exit");
		}
	}				