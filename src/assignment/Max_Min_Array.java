package assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Max_Min_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int[] array = {13, 12, 9, 18,3, 21};
	        int max = array[0]; // at first max=13
	        int min = array[0]; //  min =13
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) { //
	                max = array[i]; // Update maximum value
	            }
	            if (array[i] < min) {
	                min = array[i]; // Update minimum value
	            }
	        }
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
			
		
		
		
		
	}

}
