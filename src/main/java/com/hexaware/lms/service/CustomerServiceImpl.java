package com.hexaware.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.Loan;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Override
	public boolean login(String role, String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double interestCalculator(double principal, double rate, int tenure) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double emiCalculator(double principal, double rate, int tenure) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Loan> customerViewAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> searchAvaiableLoans(String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> filterAvailableLoansByType(String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> filterLoanByType(String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> filterLoanByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan applyLoan(Loan loan) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
