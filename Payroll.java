// chapter 5 example 5/15/2023

import java.util.Scanner;

public class Payroll
{
	public static void main(String[] args) 
	{
		// variables and constants 
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 1.5;
		Scanner keyboard = new Scanner(System.in);

		// input phase
		System.out.print("How many hours did you work this week? >>");
		hoursWorked = keyboard.nextDouble();
		System.out.print("Please enter your regular pay rate >>");
		rate = keyboard.nextDouble();

		// processing phase
		if (hoursWorked > FULL_WEEK) 
		{
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
		} // end of it statement
		else 
		{
			regularPay = hoursWorked * rate;
			overtimePay = 0.0;
		} // end of else

		// output phase
		System.out.println("Regular pay is: $" + regularPay + "\nOvertime pay is: $" + overtimePay);
		System.out.println("Have a great day!");
	} // end of main()
} // end of class