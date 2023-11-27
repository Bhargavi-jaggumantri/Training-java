package assignment;

public class CheckerBoard {
	public static void main(String[] args) {
		int value=7;
		for(int row=1; row<=value;row++) {
			for(int col=1;col<=7;col++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
