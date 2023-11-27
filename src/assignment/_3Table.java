package assignment;

public class _3Table {
	public static void main(String[] args) {
		
	int i = 1;
		//while(i<=20) {
			//if(i%2 !=0) {
				//System.out.println("3 * " + i + "=" + (3*i));
			//}
			//i++;
		//}
	_3Table sc = new _3Table();
	//sc.doWhile();
	sc.forLoop();
	}
	//public void doWhile() {
		//int i =1;
		//do {
			//if(i%2!=0) {
				//System.out.println("3 * " + i + "=" + (3 * i));
			//}
			//i++;
		//}while (i<=20);
	//}
	public void forLoop() {
		int i =1;
		for(;i<=20;i++) {
			if(i%2!=0) {
			System.out.println("3 * " + i + "=" + (3 * i));
			}
		}
		
	}
}
		

