package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.Loan;

public interface ICustomerService {
	boolean login(String role, String username, String password);

	boolean register(Customer customer);
	
	double interestCalculator(double principal, double rate, int tenure);

	double emiCalculator(double principal, double rate, int tenure);

	List<Loan> customerViewAllLoans();
	
	List<Loan> searchAvaiableLoans(String loanType);
	
	List<Loan> filterAvailableLoansByType(String loanType);
	
	List<Loan> filterLoanByType(String loanType);
	
	List<Loan> filterLoanByStatus(String status);
	
	Loan applyLoan(Loan loan);
}
