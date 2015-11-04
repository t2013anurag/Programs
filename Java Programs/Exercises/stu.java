import java.util.Scanner;

class Student
	{
	private static int count=0;
	private int no;
	private String name;
	private int age;
	private int height, weight;
	private String course;

	Student () 
	{ no=0;
	 age=0;
	 height=0;
	 weight=0;
	 name= " "; 
	 course= " "; };

	Student(int n, String s , int ag, int h, int w, String c)
	{
	no = n;
	name = s;
	age = ag;
	height = h;
	weight = w;
	course = c;
	}

	Student (Student st)
	{
	no = st.no;
	name = st.name;
	age = st.age;
	height = st.height;
	weight = st.weight;
	course = st.course;
	}

	static { System.out.println("Count initialized");
	count =1000;} 

	static void stcount()
		{
//		System.out.println(no + name);
		count++;
		}

	static int noofobjects() {return count;}	

	void disp(int a )
	{ if (age < a) System.out.println(no + " "+  name + " "+ age);}

	void disp()
	{ System.out.println(no + " "+  name + " "+ age);}

	void set()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter no name age ht wt and course");
	no = s.nextInt();
	name = s.next();
	age = s.nextInt();
	height = s.nextInt();
	weight = s.nextInt();
	course = s.next();
	}

	protected void finalize(){};

	}

class stu
	{
	public static void main(String args[])
	{
	Student[] s = new Student[4];
	final int no = 3;
	for (int i = 0; i<no; i++)
	{
	s[i] = new Student();
 	Student.stcount();
//	Student.count++;
	s[i].set();
	}

	System.out.println("No of student objects"+ Student.noofobjects());

//	no++;

	System.out.println("\n\nNo Name   Age");
	for (int i = 0; i<no; i++)
	s[i].disp();

	System.out.println("\n\nNo Name   Age less than 18");
	for (int i = 0; i<no; i++)
	s[i].disp(18);

	}
	}
	