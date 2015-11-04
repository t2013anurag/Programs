

class ex1{
public static void main(String args[]) 
	{
	int a = 10, b = 0,c=0;
 	try
 	  {
	   c=a/b;
	   System.out.println("This may be printed or may not");
   	  }

	catch(ArithmeticException e)
	 { 
  	System.out.println("Sorry... Divide by zero:"+e);
	b  = 1;
	c = a/b;
       	 }
  
        System.out.println("after try/catch blocks");
	System.out.println("Ans = " +c);
  	}
 	}



	