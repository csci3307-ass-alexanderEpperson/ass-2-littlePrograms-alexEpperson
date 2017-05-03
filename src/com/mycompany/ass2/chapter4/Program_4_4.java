/**
 * 
 */
package com.mycompany.ass2.chapter4;

/**
 * @author green
 *
 */
public class Program_4_4 //Student Class
{
	private String name;
	private double average;
	public Program_4_4(String name, double average)
	{
		this.name = name;
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAverage(double average)
	{
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average;
	}
	public String getName()
	{
		return name;
	}
	public double getAverage()
	{
		return average;
	}
	public String getLetterGrade()
	{
		String letter = "";
		if(average >= 90.0)
			letter = "A";
		else if(average >= 80.0)
			letter = "B";
		else if(average >= 70.0)
			letter = "C";
		else if(average >= 60)
			letter = "D";
		else
			letter = "F";
		return letter;
	}
}
