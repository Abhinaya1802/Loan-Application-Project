package com.LoanApplicationn;

import java.util.Scanner;

public class HomeLoan extends Loan{
			
			static Scanner sc=new Scanner(System.in);
			 void getHomeLoanDocumentInfo() {
				 System.out.println("All Personal Loan documents have been verified");
			 }
			     
			public static void main(String[] args) {
				System.out.println("Welcome to vcube banking loan department ");
				
				HomeLoan pl=new HomeLoan();
				
				double salary=pl.getCustomerSalary();
				int cibil=pl.getCibilScore();
				int age=pl.getCustomerAge();
				
				System.out.println("Enter Aadhar details :");
				String aadhar=sc.next();
				
				System.out.println("Enter PAN details :");
				String Pan=sc.next();
				
				System.out.println("Enter Phone number :");
				String phone=sc.next();
				
				if(salary>=600000.00 && (cibil>=300 && cibil<=900) && age>=24
						&& pl.validateAadhar(aadhar) 
						&& pl.validatePAN(Pan) 
						&& pl.validatePhone(phone)) {
					System.out.println("Congratulations");
					System.out.println("You are Eligible for Home Loan... ");
					System.out.println("Your Loan ROI is :"+ pl.roiInfo());
					System.out.println("Enter Address Details :" );
					
					String address=pl.getAddressInfo();
					
					System.out.println("Customer Address is:"+address);
					pl.getHomeLoanDocumentInfo();
					
				}else {
					System.out.println("You are not Eligible for Home Loan ,try after sometime");
				}
			
			}


	}

