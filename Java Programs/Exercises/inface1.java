interface shape
	{
	void show();
	double area();
	}

interface disp extends shape
	{
	void show(char a);
	}

class A implements disp
	
	{
	
	int r;

	A()
	 { 
	 	r = 5;
	 }

	public void show() 
	{
		System.out.println("radius = "+r);
	}

	public void show(char a)
	{
	for (int i =0; i<50; i++) 
	System.out.print(a);
	}
	
	public double area()
	{
	return (3.14* r*r);
	}

	}
class B implements shape
	{
	int a;
	String s = "XXX";


	B() { a = 10;}

	public void show() {System.out.println("\n side = "+a + "name = " + s);}

	public double area()
	{
	return (a*a);
	}

	
	}

class inface1
	{
	public static void main(String args[])
	{
	A a = new A();
	B b = new B();
//	test t;
//	t=a;
		
	a.show();
	a.show('*');
//	t = b;
	b.show();

	
	System.out.println("Area of circle " + a.area());
	System.out.println("Area of square " + b.area());
	}
	}