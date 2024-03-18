
public class Fiinally {

	public static void main(String[] args) {
		Fiinally ff = new Fiinally ();
		long Result =ff.sum(5, 2);
		System.out.println(Result);

	}

	
	public long sum(int a,int b) {
		
	try {
		int c = a/b;
		return c;
	}
	finally {
		 System.out.println("Finally printed");
	}
	}
	
}
