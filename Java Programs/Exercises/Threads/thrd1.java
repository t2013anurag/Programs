class thrd1
	{
	public static void main(String args[])
	{
	new thtest();
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
		Thread.sleep(100);
		}
		}
		catch(InterruptedException e){ System.out.println(e);}
		
		System.out.println("Child thread exit");
		}
	}
					