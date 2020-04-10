package practice;
/*
Encapsulation
With access identification, we can use "private" to protect our secret information
In this example, Password.java has a variable named Password, but even if we use declare new class.
We still can not show Password directly.
Because "Private" only be used in the same block of class, we can use the function we declared in public
to get the information.
*/

public class Practice08_Encapsulation {
	public static void main(String[ ] args) {
	    Password Obj = new Password();
    	 // System.out.println(Obj.password); // error 
	    System.out.println(Obj.getpassword());
	  }
}
