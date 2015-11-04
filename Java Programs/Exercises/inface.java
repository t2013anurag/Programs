interface test
	{
	void show();
	double area(double x);
	}

interface vol
	{
	double volume(double a);
	}

interface test1 extends test,vol
	{
	void show(char a);
	}

class A implements test1
	{
	
	int x = 10;
	int r;
	
	void check()
	{
	System.out.println("I am just a method in A");
	}

	public void show() 
	{System.out.println("X = "+x);}

	public void show(char a)
	{
	for (int i =0; i<50; i++) 
	System.out.print(a);
	}
	
	public double area(double r)
	{
	return (3.14* r*r);
	}

	public double volume(double r)
	{
	return (r* r*r);
	}
	}

class B implements test,vol
	{
	int y=13;
	String s = "XXX";
	int r;

	public void show() 
	{System.out.println("\ny = "+y + "name = " + s);}
	
	public double area(double r)
	{
	return (r*r);
	}
public double volume(double r)
	{
	return (r* r*r);
	}
	}

class inface
	{
	public static void main(String args[])
	{
	A a = new A();
	B b = new B();
//	test t;
//	t=a;
	a.check();	
	a.show();
	a.show('*');
//	t = b;
	b.show();

		
	System.out.println("Area of circle " + a.area(5));
	System.out.println("Area of square " + b.area(5));
	System.out.println("Volume of square " + a.volume(5));
	}
	}