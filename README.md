# 🚗 Car Loan Eligibility Checker  

## 📌 Overview  
This project is a **Java console-based Car Loan Eligibility System** that simulates how a bank evaluates customer applications for car loans. It collects customer details such as salary, CIBIL score, age, Aadhaar, PAN, and phone number, then validates them against eligibility criteria.  

If the customer meets all requirements, the program confirms eligibility, displays the **Rate of Interest (ROI)**, shows the customer’s address, and verifies loan documents. Otherwise, the application is rejected.  

## 🚀 Features  
- **Eligibility Criteria**  
  - Minimum salary: ₹400,000  
  - CIBIL score: 300–900  
  - Minimum age: 21 years  
  - Valid Aadhaar, PAN, and phone number formats  

- **Loan Information**  
  - Displays Rate of Interest (ROI)  
  - Shows customer address  
  - Confirms loan document verification  

- **Decision Output**  
  - Eligible → Congratulations message + loan details  
  - Not Eligible → Rejection message  

## 🛠️ Tech Stack  
- Language: **Java**  
- Input Handling: **Scanner Class**  
- OOP Concepts: **Inheritance** (`CarLoan` extends `Loan`)  
- Validation Methods: Aadhaar, PAN, Phone number checks  

## 🎯 How to Run  
1. Clone this repository:  
   ```bash
   git clone https://github.com/your-username/carloan.git
