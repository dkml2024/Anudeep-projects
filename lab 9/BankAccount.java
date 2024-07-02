package Overload;

import java.util.Scanner;

public class BankAccount {


		
		private String accountType;
	    private double balance;

	    public BankAccount(String accountType) {
	        this.accountType = accountType;
	        this.balance = 0.0;
	    }

	    public BankAccount(String accountType, double initialBalance) {
	        this.accountType = accountType;
	        this.balance = initialBalance;
	    }
	    
	    // check the balance in the account.
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited Rs " + amount + " in your " + accountType + " account.");
	        } else {
	            System.out.println("Insufficient Funds.");
	        }
	    }
	    
	  
	   // deposit by cash, deposit by check

	    public void depositByCash(double cashAmount) {

	    	 deposit(cashAmount);
	    }

	    public void depositByCheque(double chequeAmount) {
	        deposit(chequeAmount);
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn Rs " + amount + " from your " + accountType + " account.");
	        } else {
	            System.out.println("Insufficient Funds.");
	        }}
	    
	        public double getBalance() {
	            return balance;
	        }

	        public static void main(String[] args) {
	            Scanner scanner = new Scanner(System.in);

	            BankAccount savingsAccount = new BankAccount("Savings");

	            savingsAccount.depositByCash(80000.0);

	            savingsAccount.depositByCheque(5000.0);

	            savingsAccount.withdraw(4000.0);

	            System.out.println("Savings account balance: Rs " + savingsAccount.getBalance());

	            BankAccount checkingAccount = new BankAccount("Checking", 3000.0);

	            checkingAccount.withdraw(3000.0);

	            System.out.println("Checking balance: Rs " + checkingAccount.getBalance());

	            scanner.close();

	        
	        
	    }

	}


