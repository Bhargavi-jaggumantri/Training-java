package assignment;

public class UpperBound {
	public static void main(String[] args) {
		int upperbound = 100;
		int sum=0;
		for(int val=1;val<=upperbound;val++) {
			sum+=val;
		}
		double average=sum/upperbound;
		System.out.println(sum);
		System.out.println(average);
		
	}

}
