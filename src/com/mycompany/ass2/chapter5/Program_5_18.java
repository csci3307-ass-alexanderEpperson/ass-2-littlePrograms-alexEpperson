/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author green
 *
 */
public class Program_5_18 //Interest
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int amount, principal = 100000;
		double rate = 0.5;
		double amount1;
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; year++)
		{
			amount = (int) (principal * Math.pow(1 + rate, year));
			amount1 = (double)amount / 100.0;
			System.out.printf("%4d%,20.2f%n", year, amount1);
		}

	}

}
