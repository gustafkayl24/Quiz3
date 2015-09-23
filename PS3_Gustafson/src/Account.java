
import java.util.Date;

public class Account {
	private int ID;
	private double Balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account(int ID, double Balance) {
		super();
		this.Balance = Balance;
		this.ID = ID;
		// this.annualInterestRate = annualInterestRate;
		// this.dateCreated = dateCreated;
	}

	public Account() {
		this.Balance = 0;
		this.ID = 0;
		// this.annualInterestRate = 0;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		this.Balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void deposit(double amount) {
		Balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= Balance) {
			Balance -= amount;
		} 
		else 
		{
			double needs = amount - Balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public double getMonthlyInterestRate(double monthlyRate) {
		monthlyRate = annualInterestRate / 12;
		return monthlyRate;
	}
}
