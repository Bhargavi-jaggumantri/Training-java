package assignment;
import java.util.Arrays;
//import java.util.Collections; //for descending

public class Sort {
	public static void main(String[] args) {
		Integer array[] = { 9, 1, 2, 3, 4, 5 };
		
		Arrays.sort(array);  //sorting array in ascending order
		 
        // Sorting the array in descending order
        //Arrays.sort(array, Collections.reverseOrder());
        
        
      for(int number : array) {
		System.out.println(number);	
      }
 
        // Printing the elements
        //System.out.println(Arrays.toString(array));
	
		
		
		//Arrays.sort(numbers, Collections.reverseOrder());
		//System.out.println("sorted number: ");
		
		
	}

}
