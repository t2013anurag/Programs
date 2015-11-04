class TooManyException extends Exception
	{
	TooManyException() {System.out.println("Too many numbers - I can not handle");}	
	TooManyException(String m){super(m);}
	} 

class TooLessException extends Exception
	{
	TooLessException(String m){super(m);}
	} 

class ex6{
public static void main(String args[]) throws ArithmeticException
	{
	
	try
 	  {

	   int n = args.length;
	   if (n > 5) throw new TooManyException();
	   if (n < 2) throw new TooLessException("Too few numbers... I am sorry");
	}
  	catch(TooManyException e)
	 { 
  	System.out.println(e);
       	 }
  	catch(TooLessException e)
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
	





	