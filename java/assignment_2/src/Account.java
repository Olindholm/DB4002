//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
import java.util.ArrayList;

public class Account {
	private double balance;
	private String acctNum;

	//----------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//----------------------------------------------
	public Account(String number, double initBal) {
		balance = initBal;
		acctNum = number;
	}

	//----------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//----------------------------------------------
	public String withdraw(double amount) {
		String info = "Insufficient funds";
		if (balance >= amount) {
			balance = balance- amount;
			info = "Succeeded, the new balance is : "+ balance ;
		}

		return info;
	}

	//----------------------------------------------
	// Adds deposit amount to balance.
	//----------------------------------------------
	public String deposit(double amount) {
		String info = "";
		if (amount < 0) {
			info = " Wrong amount";
		}
		else {
			balance = balance+ amount;
			info = " Succeeded, the new balance is: " + balance;
		}

		return info;
	}

	//----------------------------------------------
	// Returns balance.
	//----------------------------------------------
	public double getBalance() {
		return balance;
	}


	//----------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//----------------------------------------------
	public String toString() {
		return  " Numer: " + acctNum + " Balance: " + balance;
	}

	//----------------------------------------------
	// Returns accoutn number.
	//----------------------------------------------

	public String getAcctNum() {
		return acctNum;
	}

	public boolean equals(Object other){
		// detta skall du g�ra 
		return true;
	}
	
	public static void main(String [] arg) {
		// Exempel om hur du kan anv�nder ArrayList ocg Account-objekt 
		ArrayList <Account> lista = new ArrayList<Account>();
		// Skapa ett konto och sedan l�gga den i listan 
		Account a = new Account("1111111111", 1000);
		lista.add(a);
		// skapa account och l�gg den i listan samtidigt 
		lista.add(new Account("1111111112", 2000));
		// f�r att anropa metod skall f�rst objektet returneras fr�n listan
		// det g�rs med metoden get();
		// h�r nedan direkt anrop
		lista.get(1).deposit(4000);

		// h�r nedan f�rst anrop av get() sedan,  
		Account konto = lista.get(1);
		System.out.println(konto.deposit(300));

	}
}
