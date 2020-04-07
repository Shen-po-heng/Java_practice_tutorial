package practice;
/*
Program name:String
Editor:Shen Po Heng
Date:03.04.2020 
goal:the String of Java
You can have many way to deal with string. If you want to find more detail of it.
Just go to see the string library of Java document.
I would take some example as follow: string.length(),string.toLowerCase(),string.indexOf(),Concatenation
*/

public class Practice03_String {
	public static void main(String[] args) {
		String txt = "AbCdEfGhIjKlMnOpQrStUvWxYz";
		System.out.println("The length of the txt : " + txt.length());
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		//Finding a Character in a String
		String txt_2 = "I start learn Java, and it is so fun";
		System.out.println(txt_2.indexOf("learn")); // Outputs 7
	
		//String Concatenation
		String Boy_name = "Paul";
		String Girl_name = "Silvia";
		System.out.println(Boy_name + " love " + Girl_name);
		
		//System.out.println(Boy_name.concat(Girl_name));
		//You can also use the concat() method to concatenate two strings
		
		System.out.println(Math.max(1, 100000));
	}
}
