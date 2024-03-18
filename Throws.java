import java.util.Scanner;

public class Throws {

	public static void main(String[] args) {
		methoCalling aa = new methoCalling();
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the A value");
			int a = sc.nextInt();
			System.out.println("Enter the B vlaue");
			int b = sc.nextInt();
			aa.add(a,b);
		}
		catch(ArithmeticException ae){
			System.out.println("Input 0 is invalid");
		}

	}

}
