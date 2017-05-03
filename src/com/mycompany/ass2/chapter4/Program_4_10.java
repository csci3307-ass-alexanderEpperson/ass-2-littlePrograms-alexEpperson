/**
 * 
 */
package com.mycompany.ass2.chapter4;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_4_10//ClassAverage class
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int total = 0, count;
		System.out.print("How many grades do you wish to enter? ");
		count = input.nextInt();
		while(count <= 0)
		{
			System.out.print("Please enter a valid amount for the number of grades: ");
			count = input.nextInt();
		}
		for(int i = 1; i <= count; i++)
		{
			System.out.printf("Enter grade %d: ", i);
			int grade = input.nextInt();
			while(grade < 0 || grade > 100)
			{
				System.out.print("Please enter a valid grade: ");
				grade = input.nextInt();
			}
			total += grade;
		}
		double average = (double)total / count;
		System.out.printf("Total of the grades is %d. Average of the grades is %.2f.%n", total, average);

	}

}
