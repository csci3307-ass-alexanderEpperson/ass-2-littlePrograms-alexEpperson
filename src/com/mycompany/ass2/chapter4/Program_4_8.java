/**
 * 
 */
package com.mycompany.ass2.chapter4;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_4_8 //ClassAverage class
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int total = 0;
		int counter = 1;
		while(counter <= 10)
		{
			System.out.print("Enter grade: ");
			int grade = input.nextInt();
			total += grade;
			counter++;
		}
		int average = total / 10;
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
	}

}
