
class toomanyparameters extends Exception
		{
		toomanyparameters(String m) {super(m);}
	}

class Multicatch{
public static void main(String args[]) throws toomanyparameters
{
 try
 {
  int a=args.length;
  System.out.println("a="+a);
  int b=42/a;
  if (a > 1) throw new toomanyparameters("Too much");	 
 int c[]={50};
  c[42]=99;
  }
  catch(ArithmeticException e)
 { 
  System.out.println("Divide by zero:"+e);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
  System.out.println("Array index oob:"+e);
  }
finally
		{
		System.out.println("I will always be executed");
		} 
  System.out.println("after try/catch blocks");
  }
 }



	