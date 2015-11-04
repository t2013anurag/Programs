class thread4
	{
	public static void main(String args[]) throws InterruptedException
	{
	thtest t1 = new thtest("t1");
	thtest1 t2 = new thtest1("t2");
	
	
	try
	{
	for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " x  5 = " + i *5);
		Thread.sleep(100);
		}
	}
	catch(InterruptedException e)
		{
		System.out.println(e);
		}
	
	boolean a = t1.isAlive();
	System.out.println("Child is alive or not " + a);

	boolean a1 = t2.isAlive();
	System.out.println("Child is alive or not " + a1);
	t1.join();
	t2.join();

	System.out.println("MAin thread exit");
	}
	}

class thtest extends Thread
	{
	thtest(String s) 
		{ 	
	
		setPriority(10);
		setName(s);
		start();
		}
	public void run()
		{
		try
		{
		for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " +  5 = " + (i +5) + getName());
		Thread.sleep(10);
		}
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
		}
		System.out.println("Child thread exit");
		}
	}
	
class thtest1 extends Thread
	{
	thtest1(String s) 
		{ 	
		setPriority(1);
		setName(s);
		start();
		}
	public void run()
		{
		try
		{
		for (int i = 1000; i> 10; i/=10)
		{
		System.out.println(i + " /  10 = " + (i /10) + getName());
		Thread.sleep(10);
		}
		}
		catch(InterruptedException e)
		{
		System.out.println(e);
		}
		System.out.println("Child thread exit");
		}
	}				