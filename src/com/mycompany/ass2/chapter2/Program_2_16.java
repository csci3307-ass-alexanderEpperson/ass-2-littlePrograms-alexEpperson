/**
 * 
 */
package com.mycompany.ass2.chapter2;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_2_16
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a , b;
		System.out.println("Please enter the first integer:");
		a = input.nextInt();
		System.out.println("Please enter the second integer:");
		b = input.nextInt();
		if(a > b)
		{
			System.out.printf("%d is larger. %n", a);
		}
		else if (b > a)
		{
			System.out.printf("%d is larger. %n", b);
		}
		else
		{
			System.out.printf("%d and %d are equal. %n", a , b);
		}

	}

}
