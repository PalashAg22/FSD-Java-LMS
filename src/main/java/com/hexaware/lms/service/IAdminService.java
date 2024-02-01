package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.entities.Admin;
import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.Loan;

public interface IAdminService {
	boolean login(String role, String username, String password);

	boolean register(Admin admin);

	List<Loan> adminViewAllLoans();

	List<Loan> searchLoans(String loanType);

	Customer searchCustomer(String username);

	List<Loan> loanApplicationsForAdmin();

	List<Loan> filterLoansByStatus(String status);

	List<Customer> viewAllCustomers();

	Customer viewCustomerDetails(String username);

	List<Loan> viewLoansOfCustomer(String username);

	void updateLoanStatus(String username, String status);
	
	void createAdmin(Admin admin);

}
