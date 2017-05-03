/**
 * 
 */
package com.mycompany.ass2.chapter3;

/**
 * @author green
 *
 */
public class Account 
{
	private String name;
	private double balance;
	public Account(String name, double balance)
	{
		this.name = name;
		if(balance > 0.0)
		{
			this.balance = balance;
		}
	}
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
		{
			balance += depositAmount;
			System.out.printf("$%.2f was successfully deposited into your account.%n", depositAmount);
			System.out.printf("Your new balance is $%.2f. %n", balance);
		}
		else
		{
			System.out.printf("Sorry, $%.2f is an invalid amount to deposit.", depositAmount);
		}
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public void setBalance(double b)
	{
		this.balance = b;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return name;
	}
	public void withdraw(double amount)
	{
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.printf("$%.2f was successfully withdrawn from your account.%n", amount);
			System.out.printf("$%.2f is your remaining balance. %n", balance);
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}

}
