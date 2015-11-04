public interface test
	{
	void show();
	}

interface test1
	{
	void show(char a);
	}

class A implements test,test1
	
	{
	
	int x = 10;

	public void show() {System.out.println("X = "+x);}

	public void show(char a)
	{
	for (int i =0; i<50; i++) 
	System.out.print(a);
	}
	
	}

class B implements test
	{
	int y=13;
	String s = "XXX";
	public void show() {System.out.println("\ny = "+y + "name = " + s);}
	}

class inface
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
	}
	}