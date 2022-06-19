package com.vamshi.service;

import java.util.Random;

import com.vamshi.model.Employee;

public class CredentialService {

	public char[] generatePassword() {

		String captialLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*-=+-/<>?";

		String values = captialLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {

			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;

	}

	public String generateEmailAddress(String firstName, String lastName, String Department) {
		return firstName + lastName + "@" + Department + ".TV.com";

	}

	public void showcredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your credentails as given below");
		System.out.println("Email --> " + email);
		System.out.print("password --> 1" + "");
		System.out.print(generatedPassword);
	}

}
