

class ex7{
public static void main(String args[]) 
	{
	int a = 10, b = 2,c=0;
 	try
 	  {
	   c=a/b;
	   System.out.println("This may be printed or may not");
   	  }

	finally
	{
	System.out.println("I will always be there");
	}	
  
        System.out.println("after try/catch blocks");
	System.out.println("Ans = " +c);
  	}
 	}



	