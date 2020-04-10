package practice;
import java.util.Scanner; // import the Scanner class 
import java.util.regex.MatchResult;
/*
Program name:package
Editor:Shen Po Heng
Date:04.07.2020 
goal: package of Java 
package example from java website
A package in Java is used to group related classes. 
Think of it as a folder in a file directory. 
We use packages to avoid name conflicts, and to write a better maintainable code. 
Packages are divided into two categories:
		Built-in Packages (packages from the Java API)
		User-defined Packages (create your own packages)
		
Built-in Packages
The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.

The library contains components for managing input, database programming, and much much more. 
The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.

The library is divided into packages and classes. Meaning you can either import a single class 
(along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.

Reference: W3C School, Oracle website
*/
public class Practice09_package {

	public static void main(String[] args) {
		//package example
		String input = "1 fish 2 fish red fish blue fish";
		  Scanner s = new Scanner(input);
		  s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
		  MatchResult result = s.match();
		  for (int i=1; i<=result.groupCount(); i++)
	         System.out.println(result.group(i));
	      s.close();
			  
	}

}