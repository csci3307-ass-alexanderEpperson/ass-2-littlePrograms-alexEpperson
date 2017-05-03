/**
 * 
 */
package com.mycompany.ass2.chapter5;
import java.util.Scanner;
/**
 * @author green
 *
 */
public class Program_5_9 //LetterGrades Class
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int total = 0, gradeCounter = 0, aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n  %s%n  %s%n", "Enter the integer grades in the range 0-100.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/LINUX/Mac OS X type <Ctrl> d then press enter",
				"On Windows, type <Ctrl> z then press enter");
		while(input.hasNext())
		{
			int grade = input.nextInt();
			total += grade;
			gradeCounter++;
			switch(grade / 10)
			{
			case 9:
			case 10: aCount++;
				break;
			case 8: bCount++;
				break;
			case 7: cCount++;
				break;
			case 6: dCount++;
				break;
			default: fCount++;
				break;
			}
		}
		System.out.print("\n Grade Report:\n");
		if(gradeCounter == 0)
		{
			System.out.println("No grades were entered.");
		}
		else
		{
			double average = (double)total / gradeCounter;
			System.out.printf("Total of the %d grades entered is: %d %n", gradeCounter, total);
			System.out.printf("Class average is: %.2f %n", average);
			System.out.println("Number of students who received each grade are as follows:");
			System.out.printf("A: %d%n", aCount);
			System.out.printf("B: %d%n", bCount);
			System.out.printf("C: %d%n", cCount);
			System.out.printf("D: %d%n", dCount);
			System.out.printf("F: %d%n", fCount);
		}
	}

}
