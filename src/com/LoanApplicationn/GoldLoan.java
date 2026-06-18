package com.LoanApplicationn;


	import java.util.Scanner;

	public class GoldLoan extends Loan {
		static Scanner sc=new Scanner(System.in);
	    void getGoldLoanDocumentInfo() {
	        System.out.println("Gold valuation and documents verified");
	    }

	    public static void main(String[] args) {

	        System.out.println("Welcome to Vcube Banking Gold Loan Department");

	        GoldLoan gl = new GoldLoan();

	        double salary = gl.getCustomerSalary();
	        int cibil = gl.getCibilScore();
	        int age = gl.getCustomerAge();

	        System.out.println("Enter Aadhar Details:");
	        String aadhar = sc.next();

	        System.out.println("Enter PAN Details:");
	        String pan = sc.next();

	        System.out.println("Enter Phone Number:");
	        String phone = sc.next();

	        if (salary >= 200000 &&
	            cibil >= 300 && cibil <= 900 &&
	            age >= 18 &&
	            gl.validateAadhar(aadhar) &&
	            gl.validatePAN(pan) &&
	            gl.validatePhone(phone)) {

	            System.out.println("Congratulations");
	            System.out.println("You are Eligible for Gold Loan");
	            System.out.println("ROI : " + gl.roiInfo());

	            String address = gl.getAddressInfo();
	            System.out.println("Customer Address : " + address);

	            gl.getGoldLoanDocumentInfo();

	        } else {
	            System.out.println("You are not Eligible for Gold Loan");
	        }
	    }
	}

