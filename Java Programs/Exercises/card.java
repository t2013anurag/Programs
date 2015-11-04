import java.util.Scanner;
import java.lang.String;

class card
	{
	public static void main(String args[])
	{
	int sum=0,psum=0,inter=0;
	Scanner s = new Scanner(System.in);
	String n = s.next();
	int l = n.length();
	System.out.println(l);
	if (l == 15) System.out.println("American express");
	else if (l == 13 || l == 16) 
	{
	if (n.charAt(0) == '4') System.out.println("Visa");
	if (n.charAt(0) == '5' && (n.charAt(1) == '1' || n.charAt(1) == '2'  || n.charAt(1) == '3' || n.charAt(1) == '4' || n.charAt(1) == '5'))
		  System.out.println("Master");}
	else {System.out.println(" Not a valid credit card number");return;}
	for (int i=l-2; i>=0; i-=2)
	{
	System.out.println("Double ="+ Character.getNumericValue(n.charAt(i)));
	psum = 2 * Character.getNumericValue(n.charAt(i));

	if (psum >=10) {
			String pst = Integer.toString(psum);
			inter = Character.getNumericValue(pst.charAt(0))+ Character.getNumericValue(pst.charAt(1));
			sum+= inter;
			}
	else sum+= psum;
	}
	for (int i=l-1; i>=0; i-=2)
	{
	System.out.println("Single ="+ Character.getNumericValue(n.charAt(i)));
	sum+= Character.getNumericValue(n.charAt(i));
	}
	System.out.println(sum);
	if (sum %10 == 0) System.out.println("Valid Credit card no");
	else System.out.println("Not a valid Credit card no");
	}
	
	}