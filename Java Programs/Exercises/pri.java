class pri
	{
	public static void main(String args[])
	{
	int no = 50;
	int mul = 1;

	for (int i = 2; i<Math.sqrt(no); i++)
	{
	if (no % i == 0 && isprime(i) ) mul *= i;
	}

	System.out.println(mul);
	if (mul == no) System.out.println("Hit");
	}

	public static boolean isprime(int n)
	{
	for (int i=2; i<n/2; i++)
	{
	if (n %i == 0) return false;}
	return true;
	}

	}