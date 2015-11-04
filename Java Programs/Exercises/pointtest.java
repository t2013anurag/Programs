class point
	{
	int x,y;
	
	point() { x = 0; y =0;}
	point(int a , int b) { x = a; y = b;}
	point(point p){ x = p.x; y = p.y;}

	boolean isequal(point p1)
	{
	if (x == p1.x && y == p1.y) return true;
	else return false;
	}
	
	point add(int a,int b)
	{
	return (new point(x+a , y+b));
	}
	
	point add (point p)
	{
	//point p1= new point();
//	p1.x = x+p.x;
//	p1.y = y+p.y;
	return (new point (x+p.x,y+p.y));
	}
public String toString()
{ return "( "+ x + " , " + y + " ) ";}

	void display_point()
	{
	System.out.println("( "+ x + " , " + y + " ) " );
	}
	double distance(int a, int b)
	{
	double ans;
	ans = Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
	return ans;
	}

	double distance(point p)
	{
	double ans;
	ans = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	return ans;
	}

	}
class pointtest
	{
	public static void main(String args[])
	{
	point p1 = new point(2,3);
	point p2 = new point (4,5);

	p1.display_point();
	p2.display_point();
	point p3 = p1.add(p2);
//	p3.display_point();
	System.out.println(p3);
	System.out.println(p1);
	if (p1.isequal(p2) == true) System.out.println("Equal");
	else System.out.println("Not equal");
	point p4 = p1;
	if (p1.isequal(p4) == true) System.out.println("Equal");
	else System.out.println("Not equal");

	p1.add(4,5);
	System.out.println("p1 = "+ p1.add(4,5));
	System.out.println("Distance between 2 3 and 5 7 "+ p1.distance(5,7));
	System.out.println("Distance between 2 3 and 4 5 "+p1.distance(p2));
	}
	}