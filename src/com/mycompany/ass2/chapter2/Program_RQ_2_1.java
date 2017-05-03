/**
 * 
 */
package com.mycompany.ass2.chapter2;

/**
 * @author green
 *
 */
public class Program_RQ_2_1 
{
public static void main(String[] args)
{
	float a, b, c, d, result;
	a = 5.5f;
	b = 2.5f;
	c = 1.3f;
	d = 3.0f;
	result = (a * b) - (c * d);
	System.out.printf("%.1f x %.1f - %.1f x %.1f = ", a , b , c , d);
	System.out.printf("%.2f%n", result);
	float e, f;
	e = 31.5f;
	f = 1.5f;
	System.out.printf("%.1f - %.1f = %.1f%n", e, f, (e-f));
}
}
