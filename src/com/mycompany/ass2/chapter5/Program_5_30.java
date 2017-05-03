/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author green
 *
 */
public class Program_5_30 //Uses AutoPolicy class
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		AutoPolicy policy1 = new AutoPolicy(11111111 , "Toyota Camry" , "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222 , "Ford Fusion" , "ME");
		policyDisplay(policy1);
		policyDisplay(policy2);
	}
	public static void policyDisplay(AutoPolicy policy)
	{
		System.out.println("The Auto Policy:");
		System.out.printf("%s%d%n", "Account number: ", policy.getAccountNumber());
		System.out.printf("%s%s%n", "Make and Model: ", policy.getMakeAndModel());
		System.out.printf("%s%s%n", "State: ", policy.getState());
		System.out.printf("%s%s%n" , "No-Fault State? : ", (policy.isNoFaultState() ? "Y" : "N"));
	}

}
