class mythread implements Runnable{
		mythread() 
			{
			Thread t = new Thread(this);
			t.start();
			}
		public void run(){
			System.out.println("Thread Started");
		}
	}
	
	class thread1 {
		public static void main(String args[]){	
			new mythread(); 
			}
	}
