package assignment;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total marks: ");
		int totalMarks = sc.nextInt();
		char grade;
		switch(totalMarks * 10 /10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
		case 7:
			grade = 'B';
			break;
		case 6:
		case 5:
			grade = 'C';
			break;
		case 4:
		case 3:
			grade = 'D';
			break;
		case 2:
		case 1:
			grade = 'E';
			break;
		default:
			grade = 'F';
			
		}
		if(grade == 'F')
			System.out.println("Fail");
		else
			System.out.println(grade);
		
	System.out.println(9/10);	
	}
	

}
