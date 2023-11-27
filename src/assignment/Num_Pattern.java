package assignment;

public class Num_Pattern {
	public static void main(String[] args) {
		int value = 5;
		for(int row=1;row<=value;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("end");
	}

}
