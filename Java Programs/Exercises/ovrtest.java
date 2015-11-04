class ovr
	{
	
	int sum(int a , int b)
	{
	return (a+b);
	}

	int sum(int a , int b , int c)
	{
	return(a+b+c);}

	int sum(int A[])
	{
	int s=0;
	for (int i =0; i<A.length; i++)
	s+= A[i];
	return(s);
	}
	}
class ovrtest
	{
	public static void main(String args[])
	{
	ovr s = new ovr();
	
	System.out.println(s.sum(4,3));
		
	System.out.println(s.sum(4,3,7));

	int[] A = { 5,6,7,8,9};

	System.out.println(s.sum(A));	
	}
	}