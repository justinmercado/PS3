// Justin Mercado
// Practice Set 3

package MainPackage;

import java.util.Date;


public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;

	// No-arg constructor
	public Account() {

	}

	// Constructor that creates an account with id and balance.
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}

	// Accessor Method for id.
	public int getId() {
		return id;
	}

	// Mutator Method for id.
	public void setId(int id) {
		this.id = id;
	}

	// Accessor Method for balance.
	public double getBalance() {
		return balance;
	}

	// Mutator Method for balance.
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Accessor Method for annualInterestRate.
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Mutator Method for annualInterestRate.
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Accessor method for dateCreated.
	public java.util.Date dateCreated() {
		return dateCreated;
	}

	// Returns the monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		}
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}

}
