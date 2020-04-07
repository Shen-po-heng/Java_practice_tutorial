package practice;
/*
Program name:Variable
Editor:Shen Po Heng
Date:02.04.2020 
goal:the variable of Java

Java Identifiers
All Java variables must be identified with unique names,called identifiers.
*/
public class Practice02_variables {
	public static void main(String[] args) {
		//String
		String name = "Paul";
		System.out.println("Hello " + name);
		
		String firstName = "Paul ";
		String lastName = "Shen";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		//int
		// final int myNum = 15; 
		// "final" means unchangeable and read-only
		int Num = 7;
		System.out.println(Num);
		
		int x = 73;
		int y = 29;
		System.out.println(x + y); // Print the value of x + y
		
		//Scientific Numbers
		//A floating point number can also be a scientific number with an "e" to indicate the power of 10
		float fnum = 35e3f;
		double dnum = 12E4d;
		System.out.println(fnum);
		System.out.println(dnum);
		
	    char Letter = 'J';         // character
	    String Text = "Haha";     // String    
	    System.out.println(Letter);
	    System.out.println(Text);
	    
	    //Booleans
	    boolean text = true;
	    boolean text_02 = false;
	    System.out.println(text);     // Outputs true
	    System.out.println(text_02);   // Outputs false
	}
}
