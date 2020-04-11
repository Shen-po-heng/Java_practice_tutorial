package practice;
/*
Program name: Inheritance
Editor:Shen Po Heng
Date:04.07.2020 
goal:Inheritance  of Java 
 
subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from

Polymorphism: means "many forms", and it occurs 
when we have many classes that are related to each other by inheritance.
 */

//base class
class music{
	protected String singer ="Jay Chou";
	public void song() {
		System.out.println("Busy Cowboy!!");
	}
}

class Itruelybelieve extends music{
	public void song() {
		System.out.println("Sky fire!!");
	}
}

class Hero extends music{
	public void song() {
		System.out.println("Hero!!");
	}
}
//classinclass
class OutClass {
	  int x = 10;

	  class InClass {
	    int y = 5;
	  }
	}

public class Practice10_Inheritance extends music{
	private String company = "JVR Music";    // Car attribute
	public static void main(String[] args) {
		Practice10_Inheritance s = new Practice10_Inheritance();
		s.song();
		System.out.print(s.company+" "+s.singer);
		
		//Polymorphism
		music song01= new music();
		music song02= new Itruelybelieve();
		Hero song03= new Hero();
		
		song01.song();
		song02.song();
		song03.song();
		
		//inner class
		//To access the inner class, create an object of the outer class, 
		//and then create an object of the inner class
		OutClass Outer = new OutClass();
	    OutClass.InClass Inner = Outer.new InClass();
	    System.out.println(Inner.y + Outer.x);
	}
}
