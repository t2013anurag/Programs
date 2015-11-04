class produce
	{
	public static void main(String args[])
	{
	queue q = new queue();
	producer p = new producer(q);
	consumer c = new consumer(q);
	}
	}


class queue
	{
	int no;
	boolean produced=false;
	synchronized int get()
		{
		if (produced == false)
		{
		try
		{	
		wait();
		}
		catch(Exception e) { System.out.println(e);}
		}
		System.out.println("Got " + no);
		produced = false;
		notify();
		return(no);
		}

	synchronized void put(int n)
		{
		if (produced == true)
		{
		try
		{	
		wait();
		}
		catch(Exception e) { System.out.println(e);}
		}
		no = n;
		produced = true;
		System.out.println("put " + no);		
		notify();
		}
	}

class producer implements Runnable
		{
		queue pq;
		Thread t;
		producer(queue q)
			{
			pq = q;
			t = new Thread(this);
			t.start();
			}

		public void run()
			{
			int i = 0;
			for (i=0; i<=10; i++)
			{
			try
			{
			pq.put(i); Thread.sleep(1000);
			}
			catch(InterruptedException e) { System.out.println(e);}

			}
			}
		}

class consumer implements Runnable
		{
		queue pq;
		Thread t;
		consumer(queue q)
			{
			pq = q;
			t = new Thread(this);
			t.start();
			}

		public void run()
			{
			for (int i=0; i<=10; i++)
			{
			try
			{
			pq.get();

			Thread.sleep(50000);
			}
			catch(InterruptedException e) { System.out.println(e);}
			}
		}
		}