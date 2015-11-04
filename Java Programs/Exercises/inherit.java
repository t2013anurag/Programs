

abstract class A
	{
	int x;
	
	A() { x = 90;}
	
	A(int a) { x = a;}
	
	void disp() {System.out.println("In A");}

	abstract void show();
	

	}

class B extends A
	{
	int y;

	B() { x = 12; y = 13;}

	B(int a,int b){ super(a); y = b;}

	void disp() {System.out.println("In B");}

	void show()
		{
		System.out.println("Inside B x+y = "+x + " "+y);}  

	}

class C extends A
	{
	int z=100;

	void show()
		{
		System.out.println("Inside C x+y = "+ x + " "+z);} 
	void disp() {System.out.println("In C");}
	}

class inherit
	{
	public static void main(String args[])
	{
	A a=new A();
	B b = new B();
	C c = new C();

//	a.show();
	b.show();
	c.show();

//	a.disp();
	a = b;
	a.disp();
	a = c;
	a.disp(); 
	}
	}