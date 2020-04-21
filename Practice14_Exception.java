package practice;
/*
Program name: Exception
Editor:Shen Po Heng
Date:04.07.2020 
goal: Exception of Java

The try statement allows you to define a block of code to be tested for errors 
while it is being executed.

The throw statement is used together with an exception type. 
There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc

*/

public class Practice14_Exception {
	
	static void Checkcondition(int money) {
	    if (money < 100000) {
	      throw new ArithmeticException("You can't get in this card game group");
	    }
	    else {
	      System.out.println("Come on, are you ready to earn a lot of money? just go for it");
	    }
	  }
	
	public static void main(String[] args) {
		try {
		      int[] Num = {67,8,-25};
		      System.out.println(Num[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		        System.out.println("The 'try catch' is finished.");
		        Checkcondition(10000); 
		    }
			/*The finally statement lets you execute code, after try...catch, 
			 regardless of the result*/
	}

}
