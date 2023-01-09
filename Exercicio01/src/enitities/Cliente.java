package enitities;

public class Cliente {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Cliente (int accountNumber, String accountHolder ) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public Cliente (int accountNumber, String accountHolder, double initialDeposit ) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}


	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.00;
	}
	
	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + String.format("%.2f", balance);
	}
}
