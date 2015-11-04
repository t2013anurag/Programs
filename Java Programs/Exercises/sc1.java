
import java.util.Scanner;
import java.util.Random;

class sc1
	{
	public static void main(String args[])
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Guess a number within 10");
		int no = s.nextInt();	
		
		Random r = new Random(); 
		int n = r.nextInt(10);
		System.out.println("Random no = " + n);
	
		
		if (no == n) {System.out.println("You won");}
		else {System.out.println("You Lost");}


		}
	}

