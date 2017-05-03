/**
 * 
 */
package com.mycompany.ass2.chapter5;

/**
 * @author green
 *
 */
public class AutoPolicy
{
	private int accountNumber;
	private String makeAndModel;
	private String state;
	public AutoPolicy(int accountNumber, String makeAndModel, String state)
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}
	public void setAccountNumber(int acc1)
	{
		this.accountNumber = acc1;
	}
	public void setMakeAndModel(String mm1)
	{
		this.makeAndModel = mm1;
	}
	public void setState(String st1)
	{
		if(state == "CT" || state == "MA" || state == "ME" || state == "NH" ||state == "NJ" || state == "NY" || state == "PA" || state == "VT")
			this.state = st1;
		else
			System.out.println("Invalid state entered");
	}
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	public String getMakeAndModel()
	{
		return this.makeAndModel;
	}
	public String getState()
	{
		return this.state;
	}
	public boolean isNoFaultState()
	{
		boolean noFaultState;
		switch (getState())
		{
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
			noFaultState = true;
			break;
		default: 
			noFaultState = false;
			break;
		}
		return noFaultState;
	}
}
