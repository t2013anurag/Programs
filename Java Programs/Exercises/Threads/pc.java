class Qu
	{
	int n;
	boolean flag = false;
	synchronized int get()
		{
		if (!flag) 
			
			try
			{
			wait();
			} 

			catch (InterruptedException e) { System.out.println(e);}
		
		System.out.println("Got" + n); 
		flag = false;
		notify();
		return(n);
		}

	synchronized void put(int n)
		{
		if (flag)
			try
			{
			wait();} 
			catch(InterruptedException e) { System.out.println(e);}


		this.n = n;
flag = true;
		System.out.println("Put" + n);
notify();
		}

	}

class producer extends Thread
	{
	Qu q;

	producer(Qu a) { q = a; start();}

	public void run()
		{
		int i = 0;
		while (true) { q.put(i++); }
		}
	}


class consumer extends Thread
	{
	Qu q;
	
	consumer(Qu a) { q = a; start();}
	
	public void run()
		{
	while (true)
		{
		q.get();
		}
		}	
	}

class pc
	{
	public static void main(String args[])
		{
		Qu q = new Qu();
		new producer(q);
		new consumer(q);
		}
	}