package practice;
/*
Program name:method
Editor:Shen Po Heng
Date:09.04.2020 
goal: method of Java 
Its use is like function in other programming language
*/
public class Practice06_method {
	String name="Shen Paul";
	static void Method() {
	    System.out.println("I just got executed!");
	  }
	
	static void Method_2(String fname) {
	    System.out.println(fname + " HaHa");
	  }
	
	/*static int plusInt(int x, int y) {
		  return x + y;
	}

	static double plusDouble(double x, double y) {
		  return x + y;
	}*/
	
	static int plus(int x, int y) {
		  return x + y;
	}

	static double plus(double x, double y) {
		  return x + y;
	}
	
	public static void main(String[] args) {
		Method();
		Method_2("Paul");
		
		int a=plus(3,4);
		double d=plus(3.6,4.5);
		System.out.printf(a+","+d);
	}
}
