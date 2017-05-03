/**
 * 
 */
package com.mycompany.ass2.chapter2;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_2_17 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int x, y, z, sum, product, smallest, largest;
		float average;
		System.out.print("Enter first integer: ");
		x = input.nextInt();
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		sum = x + y + z;
		product = x * y * z;
		average = (float)sum / 3.0f;
		if (x > y && x > z)
		{
			largest = x;
		}
		else if (y >= x && y >= z)
		{
			largest = y;
		}
		else if (z >= x && z >= y)
		{
			largest = z;
		}
		else
		{
			largest = x;
		}
		if (x <= y && x <= z)
		{
			smallest = x;
		}
		else if (y <= x && y <= z)
		{
			smallest = y;
		}
		else if (z <= x && z <= y)
		{
			smallest = z;
		}
		else
		{
			smallest = x;
		}
		System.out.printf("The sum of the integers is %d.%n", sum);
		System.out.printf("The average of the integers is %.2f.%n ", average);
		System.out.printf("The product of the integers is %d.%n", product);
		if (x==y && x == z)
		{
			System.out.println("Congratulations! All three numbers you entered are equal!");
		}
		else
		{
			System.out.printf("The highest number is %d, and the lowest number is %d.%n", largest , smallest);
		}

	}

}
