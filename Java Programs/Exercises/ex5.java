


class TooManyException extends Exception
	{
	TooManyException(String s) {super(s);}	
	}


class ex5{
public static void main(String args[]) 
	{
	
	try
 	  {
	   int n = args.length;
	   if (n > 5) throw new TooManyException("Too many parameters");
	   }
  	catch(TooManyException e)
	 { 
  	System.out.println(e);
       	 }

   finally
	{
	System.out.println("Finally block - Always executed");
	}

		
        System.out.println("after try/catch blocks");

  	}
 	}



	