class A {
   synchronized void amethod(B b) {
      String name = Thread.currentThread().getName();
      System.out.println(name + " entered A.amethod"); 
      try {
         Thread.sleep(1000);
      	} catch(Exception e) {
         System.out.println("A Interrupted");
      	}
      System.out.println(name + " trying to call B.last()");
      b.last();
     }
   synchronized void last() {
      System.out.println("Inside A.last");
   }
}

class B {
   synchronized void bmethod(A a) {
      String name = Thread.currentThread().getName();
      System.out.println(name + " entered B.bmethod");
      try {
         Thread.sleep(1000);
      } catch(Exception e) {
         System.out.println("B Interrupted");
      }
      System.out.println(name + " trying to call A.last()");
      a.last();
   }
   synchronized void last() {
      System.out.println("Inside A.last");
   }
}
public class dlock implements Runnable {
   A a = new A();
   B b = new B();
   dlock() {
      Thread.currentThread().setName("MainThread");
      Thread t = new Thread(this, "RacingThread");
      t.start();
      a.amethod(b); // get lock on a in this thread.
      System.out.println("Back in main thread");
   }
   public void run() {
      b.bmethod(a); // get lock on b in other thread.
      System.out.println("Back in other thread");
   }
   public static void main(String args[]) {
      new dlock();
   }
}