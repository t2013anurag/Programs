class outer
	{
	int x=10;
	
	class inner
		{
		int y=5;
		
		void display()
		{
		System.out.println(x+y);
		}
		}
	void display()
	{
	inner i = new inner();
	i.display();
	System.out.println(x);
	}
	}
class tes
	{
	public static void main(String args[])
	{
	outer o = new outer();
	o.display();
	}
	}


