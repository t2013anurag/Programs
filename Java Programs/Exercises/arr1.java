import java.util.*;
import test.*;

class arr1
	{
	

	public static void main(String args[])
	{
	Check1 c = new Check1();
	c.show();
	int[] nos = new int[5];
	int[] gap = new int[4];
	Scanner x = new Scanner(System.in);	
	System.out.println("Enter 5 values");

	for (int i=0; i<5; i++)
	{
	nos[i] = x.nextInt();
	}

	for (int i =0; i<4; i++)
	{
	gap[i] = Math.abs(nos[i+1] - nos[i]);} 

	System.out.println(Arrays.toString(gap));


	System.out.println("sorted array");
	Arrays.sort(gap);

//	System.out.println(Arrays.toString(nos));

	System.out.println(Arrays.toString(gap));
		
	System.out.println("Min gap = " + gap[0]);
//	printarray(3);

	
	}
/*static void printarray(int n)
	{
	if (n ==0 ) return;
	else printarray(n-1);
	System.out.println("nos [ "+ (n-1) + " ] = "+nos[n-1]);
	} */

	}

	