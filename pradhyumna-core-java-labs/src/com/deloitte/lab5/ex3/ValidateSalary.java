package com.deloitte.lab5.ex3;

public class ValidateSalary {
	public static void checkSalary(double salary) {
		// TODO Auto-generated method stub
		try {
			if (salary < 3000) {
				throw new EmployeeException("The salary shoud be above 3000");
			}
			else
			{
				System.out.println("The salary of the mployee is "+salary);
			}
		}
		// catch the exception thrown from try block
		catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
		}
		
	}

}
