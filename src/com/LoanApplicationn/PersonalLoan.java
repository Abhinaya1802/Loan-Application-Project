package com.LoanApplicationn;

import java.util.Scanner;

public class PersonalLoan extends Loan {
	static Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocumentInfo() {
		System.out.println("All Personal Loan Documents have been verified..");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to VCube banking personal loan Department");
		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getCustomerSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getCustomerAge();
		System.out.println("Enter Aadhar Details:");
		String aadhar = sc.next();
		System.out.println("Enter PAN number:");
		String pan = sc.next();
		System.out.println("Enter phone number:");
		String phone = sc.next();
		if (salary >= 1000000.00 && (cibil >= 300 && cibil <= 900) && age >= 25 && pl.validateAadhar(aadhar)
				&& pl.validatePAN(pan) && pl.validatePhone(phone)) {
			System.out.println("Congratulations!!!");
			System.out.println("You are Eligible for Personal Loan!!");
			System.out.println("Your Loan ROI is :" + pl.roiInfo());
			System.out.println("Enter Address Detais ");
			String address = pl.getAddressInfo();
			System.out.println("Customer Address is:" + address);
			pl.getPersonalLoanDocumentInfo();
		} else {
			System.out.println("You are not Eligible for Personal Loan try After Some time!!");
		}

	}
}