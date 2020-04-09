package practice;
/*
Program name:intro_OOP
Editor:Shen Po Heng
Date:09.04.2020 
goal:Introduciont OOP of Java 
 
OOP stands for Object-Oriented Programming.

Object-oriented programming has several advantages over procedural programming:
OOP is faster and easier to execute, and provides a clear structure for the programs
OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
*/
public class Practice07_intro_OOP {
	int x ;
	
	//constructor
	public Practice07_intro_OOP() {
		x=1000000;
	}
	
	// Static method
	  static void StaticMethod() {
	    System.out.println("Static methods can be called directly");
	  }

	  // Public method
	  public void PublicMethod() {
	    System.out.println("Public methods need to be called by creating objects");
	  }
	
	
	public static void main(String[] args) {
		Practice07_intro_OOP myObj = new Practice07_intro_OOP();
	    System.out.println(myObj.x);
	    
	    //Using Multiple Classes
	    /*
	     * You can also create an object of a class and access it in another class. 
	     * This is often used for better organization of classes 
	     * (one class has all the attributes and methods, 
	     * while the other class holds the main() method (code to be executed)).
	     * */
	    Practice06_method obj = new Practice06_method();
	    System.out.println(obj.plus(7.6,8.9));
	    System.out.println(obj.name);
	    obj.name="Diego";
	    obj.Method_2(obj.name);
	    
	    //Static vs. Non-Stati
	    StaticMethod(); // Call the static method
	    Practice07_intro_OOP myObj_02 = new Practice07_intro_OOP(); // Create an object of MyClass
	    myObj_02.PublicMethod(); // Call the public method
	    
	}

}
