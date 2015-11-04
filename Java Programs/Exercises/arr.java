import java.util.*;

class arr
	{
	public static void main(String args[])
	{
	int[] A = new int[3];
	int[] B = { 2,4,6,8};

	String[] name = {"xxx","yyy","zzz"};

	Scanner s = new Scanner(System.in);
	System.out.println("Enter 3 values");

	int[] C = new int[3];

	for (int i =0; i<3; i++)
	{A[i] = s.nextInt(); B[i] = A[i];}

	System.out.println("The given array");
	System.out.println(Arrays.toString(A));

	int[] Aold = A;

	Arrays.sort(A);
	System.out.println(Arrays.toString(A));
	for (int i =0; i<A.length; i++)
	System.out.println(B[i]);  
	}
	}
	