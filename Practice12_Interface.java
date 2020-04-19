package practice;
/*
Program name: Interface
Editor:Shen Po Heng
Date:04.07.2020 
goal: Interface of Java

Data abstraction is the process of hiding certain details 
and showing only essential information to the user.

Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" 
that is used to group related methods with empty bodies

Reference:W3C school
 */
//Interface
interface CusinePp {
public void Veg(); // interface method (does not have a body)
public void meat(); // interface method (does not have a body)
}

class Steak implements CusinePp {
	public void Veg() {
	 System.out.println("Fry it!!");
	}
	public void meat() {
	 System.out.println("Roast it!!");
	}
}

public class Practice12_Interface {
	public static void main(String[] args) {
	    Steak meal=new Steak();
	    meal.Veg();
	    meal.meat();
	  }
}
