/**
 * 
 */
package com.mycompany.ass2.chapter3;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_3_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String _name;
		double startingBalance, deposit, withdrawal, balance;
		int choice;
		System.out.print("You need to start an account. \n Please enter your name: ");
		_name = input.nextLine();
		System.out.print("Please enter the starting amount for your account: ");
		startingBalance = input.nextDouble();
		Account account1 = new Account(_name, startingBalance);
		System.out.println("What would you like to do?");
		System.out.println("1: Display balance");
		System.out.println("2: Make a deposit");
		System.out.println("3: Make a withdrawal");
		choice = input.nextInt();
		switch (choice)
		{
		case 1: balance = account1.getBalance();
				System.out.printf("Your current balance is: $%.2f", balance);
				break;
		case 2: System.out.println("How much would you like to deposit?");
				deposit = input.nextDouble();
				account1.deposit(deposit);
				break;
		case 3: System.out.println("How much would you like to withdraw?");
				withdrawal = input.nextDouble();
				account1.withdraw(withdrawal);
				break;
		default: System.out.println("I'm sorry, you have made an invalid selection.");
		}

	}

}
