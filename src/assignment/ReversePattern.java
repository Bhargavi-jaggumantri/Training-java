package assignment;

public class ReversePattern {
	public static void main(String[] args) {
		int value=10;
		for(int row=1;row<=value;row++) {
			for(int col=1;col<=value-row+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
