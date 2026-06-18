package com.LoanApplicationn;

import java.util.Scanner;

public class Loan {
		
		static Scanner sc=new Scanner(System.in);

		 boolean validateAadhar(String aadhar) {
			return aadhar.matches("\\d{12}");
			
		 }
		 
		 boolean validatePAN(String pan) {
			 return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
			 
		 }
		 
		 boolean validatePhone(String phone) {
			 return phone.matches("[6-9]{1}[0-9]{9}");
			 
		 }
			
		 double getCustomerSalary(){
			 System.out.println("Enter your salary : ");
			 double salary=sc.nextDouble();
			 return salary; 
		 }
		 	 
		 int getCustomerAge(){
	        System.out.println("Enter your age :");
	        int age=sc.nextInt();
	        return age;
		 }
		 	  
		 int getCibilScore() {
			  System.out.println("Enter your Cibil Score :");
			  int cibil=sc.nextInt();
			  return cibil;
		 }
		 
		 
		 double roiInfo(){
		     double roi=12.0;
		     
		     int cibilScore=getCibilScore();
		     
		     if(cibilScore>=300 && cibilScore<=599) {
		    	 System.out.println("Poor score; high risk for lenders,loan application may be rejected or approved at high interest rates");
		         roi=11.0;
		     }else if(cibilScore>=600 && cibilScore<=699) {
		    	 System.out.println("Fair score; moderate risk,may face stricter loan terms");
		    	 roi=10.0;
		     }else if(cibilScore>=700 && cibilScore<=749 ) {
		    	 System.out.println("Good score; better chances of loan approval with favourable interest rates");
		    	 roi=9.0;
		     }else if(cibilScore>=750 && cibilScore<=900) {
		    	 System.out.println("Excellent score;lowest risk,easier loan approval, and potential for higher loan ammounts at lowest rates");
		    	 roi=8.0;
		     }else {
		    	 System.out.println("Invalis Cibil Score");
		     }
		     
		     return roi;
		 }
		 
		 
		 String getAddressInfo() {
			 String address="";
			 
			 System.out.println("Enter flat number :");
			 String flat=sc.next();
			 
			 System.out.println("Enter plot name:");
			 sc.nextLine();
			 String plot=sc.nextLine();
			 
			 System.out.println("Enter Street name:");
			 String Street=sc.nextLine();
			 
			 System.out.println("Enter City name:");
			 String City=sc.nextLine();
			 
			 System.out.println("Enter Pin code:");
			 long Pin=sc.nextLong();
			 
			 System.out.println("Enter State:");
			 sc.nextLine();
			 String State=sc.nextLine();
			
			 
			 address="Flat No : " + flat +
					 ", Plot name : " + plot +
					 ", Street : " + Street +
					 ", City : " + City +
					 ", Pin : " + Pin +
					 ", State : " + State ;	
			 
			 return address;
		 }

	}
