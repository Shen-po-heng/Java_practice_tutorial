package practice;

import java.util.Scanner;

/*
Program name: Interface
Editor:Shen Po Heng
Date:04.07.2020 
goal: Interface of Java

The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, 
we will use the nextLine() method, which is used to read Strings
*/
public class Practice13_userinput {

	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);

	    System.out.println("Enter some words:");

	    // String input
	    String str = Obj.nextLine();

	    System.out.println("Your input: " + str);
	}

}
