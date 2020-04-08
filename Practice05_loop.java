package practice;
/*
Program name:Loop
Editor:Shen Po Heng
Date:08.04.2020 
goal:the Loop of Java(metion array)
Loops can execute a block of code as long as a specified condition is reached.
1.while-loop: keep executing a block of code as long as a specified condition is true
2.do/while-loop: It is similar the while-loop. This loop will execute the code block at least once before checking,
if the condition is true, then it will repeat the loop as long as the condition is true. 
3.for-loop: It can repeat loop times you decided.
*/
public class Practice05_loop {
	public static void main(String[] args) {
		int i = 0;
		//while-loop
		while (i < 5) {
		  System.out.print("#");
		  i++;
		}
		
		  System.out.println();
		//dowhile-loop
		do {
			  System.out.print("#");	  
		}while (i < 5);
		  System.out.println();
		//for-loop
		for (i = 0; i < 5; i++) {
			  System.out.print("#");
		}
		  System.out.println();
		  
		//for-each loop
		//using for array
		String[] meal = {"BigMac", "Chicken Burger", "Fried Chicken", "Pork Burger","Fish Burger","Chick Nugget"};
		System.out.println("Array length:"+meal.length);
		for (String j : meal) {
		  System.out.print(j+" ");
		}
	}
}
