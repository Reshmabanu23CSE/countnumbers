import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int Number, Count=0;
			Scanner	sc = new Scanner(System.in);		

		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.println( Count);
}
}
