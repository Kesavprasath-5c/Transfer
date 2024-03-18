
public class methoCalling {

	public static void main(String[] args) {
		methoCalling methoCalling = new methoCalling();
		methoCalling.add(4, 5);
	}

	void add(int a, int b)throws ArithmeticException {
		int c = a/b;
		System.out.println("diveding of 2 numbers is :"+c);
		//return c;
	}
}
