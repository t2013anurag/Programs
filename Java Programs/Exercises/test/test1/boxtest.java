package test.test1;

class Box
	{
	private int width;
	private int length;
	private int breadth;
	Box()
	{
	width = 0; length = 0; breadth=0;}
	Box(int w, int l , int b)
	{
	width = w;
	length = l;
	breadth = b;
	}
	Box(Box b)
	{
	width = b.width;
	length = b.length;
	breadth = b.breadth;
	}

	int vol()
	{
	return width*length*breadth;
	}

	}
class boxtest
	{
	public static void main(String args[])
	{
	Box b1 = new Box();
	Box b2 = new Box(2,5,6);
	Box b3 = b2;	

//	b1.set(12,13,5);

//	int vol = b1.width * b1.length * b1.breadth;
//	System.out.println("Vol of the box = " + vol);
	
	int v = b2.vol();

	System.out.println("Vol of the box = " + v + b3.vol());	
	}
	}