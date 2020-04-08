package practice;

import java.util.Scanner;

/*
Program name:IfElse&switch
Editor:Shen Po Heng
Date:08.04.2020 
goal:IfElse of Java
if&else: It is conditionl statement. Based on the condition, it decide
a block of code should be executed or not to take different action
switch: It can select one of many code blocks to be executed.
*/
public class Practice04_ifElseSwitch {
	public static void main(String[] args) {
		//Conditions and If Statements
		
		Scanner obj=new Scanner(System.in);
		System.out.print("How much money do you have?");
		int In_money=obj.nextInt();
		if (In_money < 10000) {
		  System.out.println("You need to deposit more money, you just can apply a credit card.");
		} else if (In_money >10000 && In_money<100000) {
		  System.out.println("You can apply a credit card.");
		} else {
		  System.out.println("You can get a VIP credit card.");
		}
		//Short Hand If...Else (Ternary Operator)
		String result = (In_money < 10000)? "Reject" : "Permit";
		System.out.println(result);
		
		System.out.println("\nWhich meal do you want? (integer number between 1 and 6)");
		int meal_num=obj.nextInt();
		switch (meal_num) {
		  case 1:
		    System.out.println("BigMac");
		    break;
		  case 2:
		    System.out.println("Chicken Burger");
		    break;
		  case 3:
		    System.out.println("Pork Burger");
		    break;
		  case 4:
		    System.out.println("Fried Chicken");
		    break;
		  case 5:
		    System.out.println("Fish Burger");
		    break;
		  case 6:
		    System.out.println("Chick Nugget");
		    break;
		  default:
		    System.out.println("You only can input interger between 1 and 6");
		    break;
		}

	}
}
