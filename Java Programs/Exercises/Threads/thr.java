class thr
	{
	public static void main(String args[])
	{
	thread1 t1 = new thread1();
	t1.start();
	

	thread1 t2 = new thread1();
	t2.start();

	thread1 t3 = new thread1();
	t3.start();

	for (int i = 1; i<=5; i++) System.out.println(i + " . " + "hello");

	}
	}
class thread1 extends Thread
	{
	static int count = 0;
	public static Object o = new Object();

        public  void run()
		{
		synchronized(o){
		count ++;
		for (int i = 1; i<= count; i++) System.out.print("good"); 

		System.out.println("\n" + " count " + count);
	} }
	}
