package assignment;


public class Max_Min_Avg {
	public static void main(String[] args) {
		 Max_Min_Avg  max_Min_Avg = new Max_Min_Avg();
		int[] marks = {63,90,75,89,95};
		
		int minMarks =  max_Min_Avg.findMinValue(marks);
		int maxMarks = max_Min_Avg.findMaxValue(marks);
		double averageMarks = max_Min_Avg.findAverage(marks);
		
		System.out.println("minimum marks : " + minMarks);
		System.out.println("maximum marks : " + maxMarks);
		System.out.println("average marks : " + averageMarks);	
	}
	//to find min in an array
	public int findMinValue(int[] args) {
		int min = args[0];
		for(int i=1; i<args.length;i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}
		return min;
		
	}
	//to find max in an array
	public int findMaxValue(int[] args) {
		int max = args[0];
		for (int i=1; i<args.length;i++) {
			if(args[i] > max) {
				max = args[i];
			}
		}
		return max;
	}
	//to find average in an array
	public double findAverage(int[] args) {
		int sum = 0;
		for(int value: args) {
			sum += value;	
		}
		double average=sum / args.length;
		return average;
	}
}
