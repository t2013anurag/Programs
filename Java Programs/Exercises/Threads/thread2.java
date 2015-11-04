class mythread extends Thread{
		mythread(){start();}
		public void run(){
			System.out.println("Thread Started");
		}
	}
	
class thread2 
	 {
		public static void main(String args[])
			{	
			new mythread(); 
			}
	 }
