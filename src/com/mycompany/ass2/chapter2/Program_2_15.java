/**
 * 
 */
package com.mycompany.ass2.chapter2;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a , b , result;
		float result2;
		System.out.print("Enter first integer: \n");
		a = input.nextInt();
		System.out.print("Enter second integer: \n");
		b = input.nextInt();
		result = a + b;
		System.out.printf("%d + %d = %d%n", a , b , result);
		result = a * b;
		System.out.printf("%d x %d = %d%n", a , b , result);
		result = a - b;
		System.out.printf("%d - %d = %d%n", a , b , result);
		result2 = (float)a / b;
		System.out.printf("%d / %d = %.2f", a , b , result2);
	}

}
