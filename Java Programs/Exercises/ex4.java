

class ex4{
public static void main(String args[]) 
	{
	int a = 10, b = 2,c=0,d=0;
	int[] A = {1,2,3};

	try
 	  {
	   c=a/b;
	   try
	   {
	   d  = a/(a-a);	
	   d= A[1]+1;		
	   }
	 catch(ArrayIndexOutOfBoundsException e)
	   {
	   System.out.println("Array - unreachable element "+e);
	   }
	finally
	{
	System.out.println("Finally block inside - Always executed");
	}
	
	}
  	catch(Exception e)
	 { 
  	System.out.println("Some Problem:"+e);
	b  = 1;
	c = a/b;
       	 }

   finally
	{
	System.out.println("Finally block - Always executed");
	}

		
        System.out.println("after try/catch blocks");
	System.out.println("Ans = " +c);
  	}
 	}



	