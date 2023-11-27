package assignment;
import java.util.Scanner;

public class Three_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value: ");
		int firstvalue = sc.nextInt(); 
		System.out.println("enter second value: ");
		int secondvalue = sc.nextInt();
		System.out.println("enter third value: ");
		int thirdvalue = sc.nextInt();
		if(firstvalue > secondvalue && firstvalue > thirdvalue) {
			System.out.println("maximum value is "+ firstvalue);
		}
		if(secondvalue > firstvalue && secondvalue > thirdvalue) {
			System.out.println("maximum value is " + secondvalue);
			
		}
		else
			System.out.println("maximum value is " + thirdvalue);	
	}

}
