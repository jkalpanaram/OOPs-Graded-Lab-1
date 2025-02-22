package com.gl.oops;

import java.util.Random;

public class Credentials {

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
	
		// Using random method
		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}
	
	public String generateEmailId(String firstName, String lastName, String department)
	{
		return firstName+lastName+"."+department+"@mycompanyabc.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Welcome "+employee.getFirstName()+ ", your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.print("Password --> hi"+ "");
		System.out.print(generatedPassword);
	}
	
}
