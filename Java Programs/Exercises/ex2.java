

class ex2{
public static void main(String args[]) 
	{
	int a = 10, b = 2,c=0,d=0;
	int[] A = {1,2,3};

	try
 	  {
	   c=a/b;
		
	   d= A[10]+1;		
	  }

	catch (ArrayIndexOutOfBoundsException e)
	  {
	  System.out.println("Array element not there :"+e);
	}

	catch(Exception e)
	 { 
  	System.out.println("Divide by zero:"+e);
	b  = 1;
	c = a/b;
       	 }
  
        System.out.println("after try/catch blocks");
	System.out.println("Ans = " +c);
  	}
 	}



	