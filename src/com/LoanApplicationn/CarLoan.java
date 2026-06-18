package com.LoanApplicationn;

import java.util.Scanner;

public class CarLoan extends Loan{
	static Scanner sc=new Scanner(System.in);
	
	
	    void getCarLoanDocumentInfo() {
	        System.out.println("All Car Loan documents have been verified");
	    }

	    public static void main(String[] args) {

	        System.out.println("Welcome to Vcube Banking Car Loan Department");

	        CarLoan cl = new CarLoan();

	        double salary = cl.getCustomerSalary();
	        int cibil = cl.getCibilScore();
	        int age = cl.getCustomerAge();

	        System.out.println("Enter Aadhar Details:");
	        String aadhar = sc.next();

	        System.out.println("Enter PAN Details:");
	        String pan = sc.next();

	        System.out.println("Enter Phone Number:");
	        String phone = sc.next();

	        if (salary >= 400000 &&
	            cibil >= 300 && cibil <= 900 &&
	            age >= 21 &&
	            cl.validateAadhar(aadhar) &&
	            cl.validatePAN(pan) &&
	            cl.validatePhone(phone)) {

	            System.out.println("Congratulations");
	            System.out.println("You are Eligible for Car Loan");
	            System.out.println("ROI : " + cl.roiInfo());

	            String address = cl.getAddressInfo();
	            System.out.println("Customer Address : " + address);

	            cl.getCarLoanDocumentInfo();

	        } else {
	            System.out.println("You are not Eligible for Car Loan");
	        }
	    }
	}

