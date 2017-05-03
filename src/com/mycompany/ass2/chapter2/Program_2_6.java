/**
 * 
 */
package com.mycompany.ass2.chapter2;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_2_6 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int x, y, z, result;
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		result = x * y * z;
		System.out.printf("Product is %d%n", result);
	}

}
