package assignments;
import java.util.Scanner;
public class Greater {
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("check greater number");
		System.out.println(" enter first number");
		int a=sc.nextInt();
		System.out.println(" enter second number");
		int b=sc.nextInt();
		System.out.println(" enter thrid number");
		int c=sc.nextInt();
		
		if( a>b && a>c) {
		System.out.println(" a is greater");
	}
		if ( b>a && b>c) {
			System.out.println(" b is greater");
			
		}
		if( c>a && c>b) {
			System.out.println(" c is greater");
		}
			
		}
}
