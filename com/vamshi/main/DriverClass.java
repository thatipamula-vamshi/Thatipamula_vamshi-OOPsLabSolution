package com.vamshi.main;

import java.util.Scanner;

import com.vamshi.model.Employee;
import com.vamshi.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {

		Employee employee = new Employee("Thatipamula", "vamshi");
		CredentialService credentialService = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;

		System.out.println("Please enter the department from the below list");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResource");
		System.out.println("4. Legal");

		try (Scanner sc = new Scanner(System.in)) {
			int option = sc.nextInt();

			if (option == 1) {
				generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "Techanical");
				generatedPassword = credentialService.generatePassword();
				credentialService.showcredentials(employee, generatedEmail, generatedPassword);
			} else if (option == 2) {
				generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "Admin");
				generatedPassword = credentialService.generatePassword();
				credentialService.showcredentials(employee, generatedEmail, generatedPassword);
			} else if (option == 3) {
				generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "HumanResource");
				generatedPassword = credentialService.generatePassword();
				credentialService.showcredentials(employee, generatedEmail, generatedPassword);
			} else if (option == 4) {
				generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
						employee.getLastName().toLowerCase(), "Legal");
				generatedPassword = credentialService.generatePassword();
				credentialService.showcredentials(employee, generatedEmail, generatedPassword);
			} else
				System.out.println(" Enter a valid option");
		}
	}

}
