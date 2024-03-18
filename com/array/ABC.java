package com.array;

public class ABC implements EmployeRules,FamilyRules {
public static void main (String [] args) {
	
	ABC aa = new ABC();
	//aa.maintainhours();
	//aa.dresscode();
	
	System.out.println(aa.salery);
	System.out.println(aa.leave);
	aa.readingnews();
	aa.maintainhours();
	
	
	FamilyRules father = new ABC();
	father.readingnews();
	//father.maintainhours();
}


public void maintainhours() {
	System.out.println("8hr");
	
}


public void Relocate() {
	System.out.println("blr");
	
}


public void report() {
System.out.println("xyz");	
	
}


public void dresscode() {
	System.out.println("zzz");
	
}



public void playwithchild() {
	System.out.println("playing");
	
}



public void Takecareofhosue() {
	
	System.out.println("working");
}



public void Gardining() {
	
	System.out.println("cuttinggrass");
}


public void readingnews() {
	System.out.println("reading");
	
}
}
