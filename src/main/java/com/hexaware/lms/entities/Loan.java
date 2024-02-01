package com.hexaware.lms.entities;

import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Set the initial value(1001) for LId in the database
	private Long lId;

	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	private double principal;
	private double interestRate;
	private int tenureInMonths;
	private String loanType;
	private String status;
	private LocalDate loanApplicationDate;
	@Lob
	private byte[] idProof;

	public Loan() {
		super();
	}

	

	public Loan(Customer customer, double principal, double interestRate, int tenureInMonths, String loanType,
			String status) {
		super();
		this.customer = customer;
		this.principal = principal;
		this.interestRate = interestRate;
		this.tenureInMonths = tenureInMonths;
		this.loanType = loanType;
		this.status = status;
	}



	public Loan(Long lId, Customer customer, double principal, double interestRate, int tenureInMonths, String loanType,
			String status, LocalDate loanApplicationDate, byte[] idProof) {
		super();
		this.lId = lId;
		this.customer = customer;
		this.principal = principal;
		this.interestRate = interestRate;
		this.tenureInMonths = tenureInMonths;
		this.loanType = loanType;
		this.status = status;
		this.loanApplicationDate = loanApplicationDate;
		this.idProof = idProof;
	}

	public Long getlId() {
		return lId;
	}

	public void setlId(Long lId) {
		this.lId = lId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTenureInMonths() {
		return tenureInMonths;
	}

	public void setTenureInMonths(int tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getLoanApplicationDate() {
		return loanApplicationDate;
	}

	public void setLoanApplicationDate(LocalDate loanApplicationDate) {
		this.loanApplicationDate = loanApplicationDate;
	}

	public byte[] getIdProof() {
		return idProof;
	}

	public void setIdProof(byte[] idProof) {
		this.idProof = idProof;
	}

	@Override
	public String toString() {
		return "Loan [lId=" + lId + ", customer=" + customer + ", principal=" + principal + ", interestRate="
				+ interestRate + ", tenureInMonths=" + tenureInMonths + ", loanType=" + loanType + ", status=" + status
				+ ", loanApplicationDate=" + loanApplicationDate +", idProof="
				+ Arrays.toString(idProof) + "]";
	}

}
