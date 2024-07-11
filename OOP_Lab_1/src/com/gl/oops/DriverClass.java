package com.gl.oops;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Employee employee = new Employee("Kalpana", "Ram");
		Credentials cs = new Credentials();
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("Creating credentials for new employee : "+employee.firstName+ " " + employee.lastName );
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("Creating credentials for new employee : "+employee.firstName+ " " + employee.lastName );
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Enter Your choice : ");
		Scanner sc = new Scanner(System.in);

		int option = sc.nextInt();
//Generating new mail id and password for new Technical Staff
		if (option == 1) {
			generatedEmail = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
//Generating new mail id and password for new Admin Staff		
		else if (option == 2) {
			generatedEmail = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
//Generating new mail id and password for new HR Staff	
		else if (option == 3) {
			generatedEmail = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		//Generating new mail id and password for new Legal Dept Staff
		else if (option == 4) {
			generatedEmail = cs.generateEmailId(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else
			System.out.println("Department not chosen correctly- Please select the required option");
		
		sc.close();
	}
}
