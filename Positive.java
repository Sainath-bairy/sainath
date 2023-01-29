package assignments;
import java.util.Scanner;

public class Positive {
	public static void main (String [] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println(" enter a number to check whether it is positive or negative");
		int a=sc.nextInt();
		if ( a>=0)
		{
			System.out.println("your number is postive");
		}
		else
		{
			System.out.println(" your number is negative");
		}
	}

}



