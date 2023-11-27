package assignment;

public class Febonacci {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int number = 20;
		int sum = 1;
		for(int i=0;i<number-1;i++) {
			int temp = num1+num2;
			System.out.println(temp);
			num1 = num2;
			num2 = temp;
			sum += temp;
		}
		float mean = sum/number;
		System.out.println(mean);
	}

}
