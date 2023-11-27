package assignment;

public class StringPattern {
	public static void main(String[] args) {
		String s ="corenuts";
		for(int row=0;row<=s.length();row++) {
			for(int col=0;col<row;col++) {
				System.out.print(s.charAt(col));
			}
			System.out.println();
		}
	}

}
