
public class Throw {

	public static void main(String[] args) {
		
      Throw th1 = new Throw();
      Throw th2;
      
	
	
	try {
		th1.guna();
	}
	
	catch(NullPointerException npe) {
		System.out.println("npe");
	}
	}
	
	void guna(){
		try {
		throw new NullPointerException();
		}
		catch(NullPointerException ee) {
			System.out.println("GOT NOE");
		}
	}
 
}
