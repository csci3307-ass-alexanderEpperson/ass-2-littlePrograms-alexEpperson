/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author green
 *
 */
public class Program_4_5 //StudentTest class
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Program_4_4 account1 = new Program_4_4("Jane Green", 93.5);
		Program_4_4 account2 = new Program_4_4("John Blue", 72.75);
		System.out.printf("%s's letter grade is %s%n", account1.getName(), account1.getLetterGrade());
		System.out.printf("%s's letter grade is %s%n", account2.getName(), account2.getLetterGrade());
	}

}
