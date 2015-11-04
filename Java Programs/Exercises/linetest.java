class line
	{
	point p1,p2;
	
	line() {
		p1 = new point();
		p2 = new point();
		}
	line(point r, point s)
		{
		p1= r;
		p2= s;
		}
	line(line l)
		{
		p1 = l.p1;
		p2 = l.p2;
		}

	double distance()	
		{
		double res;
		res = p1.distance(p2);
		return res;
		}
	public String toString() { return "Line is between " + p1 + "and "+ p2;}
	}
	
class linetest
	{
	public static void main(String args[])
	{
	point p = new point(2,3);
	point q = new point(5,7);
	point r = new point();
	r = q;
	line l1 = new line(p,q);
	System.out.println("p = "+ p);
	System.out.println("q = "+ q);
	System.out.println("r = "+ r);
	System.out.println("Distance = "+l1.distance());
	}
	}