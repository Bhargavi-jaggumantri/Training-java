package assignment;

public class TablesPattern {
	public static void main(String[] args) {
		for(int row=1;row<=9;row++) {
			System.out.print(row+"|");
			for(int col=1;col<=9;col++) {
				
				System.out.print(" "+row*col);
			}
			System.out.println();
			
		}
	}

}
