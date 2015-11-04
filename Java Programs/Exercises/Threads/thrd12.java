class thrd12
	{
	public static void main(String args[])
	{
	new thtest();
	new thtest1();
	try
	{
	for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " x  5 = " + i *5);
		Thread.sleep(1000);
		}
	}
	catch (Exception e){}
	System.out.println("Main thread exit");
	}
	}

class thtest extends Thread
	{
	
	thtest() 
		{ 	
		start();
		}

	public void run()
		{
		try
		{
		for (int i = 1; i<= 5; i++)
		{
		System.out.println(i + " +  5 = " + i +5);
		Thread.sleep(1000);
		}
		}
		catch(InterruptedException e){ System.out.println(e);}
		
		System.out.println("Child thread exit");
		}
	}

class thtest1 extends Thread
	{
	
	thtest1() 
		{ 	
		start();
		}

	public void run()
		{
		try
		{
		for (int i = 10; i>1; i--)
		{
		System.out.println(i + " /  2 = " + i/2);
		Thread.sleep(10000);
		}
		}
		catch(InterruptedException e){ System.out.println(e);}
		
		System.out.println("Child thread exit");
		}
	}
					