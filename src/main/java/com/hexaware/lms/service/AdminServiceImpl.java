package com.hexaware.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.lms.entities.Admin;
import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.Loan;

@Service
public class AdminServiceImpl implements IAdminService {

	@Override
	public boolean login(String role, String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Loan> adminViewAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> searchLoans(String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer searchCustomer(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> loanApplicationsForAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> filterLoansByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomerDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> viewLoansOfCustomer(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLoanStatus(String username, String status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

}
