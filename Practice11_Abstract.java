package practice;
/*
Program name:abstraction
Editor:Shen Po Heng
Date:04.19.2020 
goal:Abstraction  of Java 

Abstract class: is a restricted class that cannot 
be used to create objects 
(to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, 
and it does not have a body. The body is provided by the subclass (inherited from).
*/
//Abstract class
abstract class cusine {
// Abstract method (does not have a body)
	public abstract void vegetable();
// Regular method
	public void meat() {
		System.out.println("Add some pepper!!");
	}
}

//Subclass (inherit from Animal)
class cabbage extends cusine {
	public void vegetable() {
		System.out.println("fry it!!");
	}
}


public class Practice11_Abstract {

	public static void main(String[] args) {
		cabbage meal = new cabbage(); // Create a Pig object
	    meal.vegetable();
	    meal.meat();
	}

}
