
import java.util.Date;

public class Account 
{
	private int ID;
	private double Balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	public Account(int ID, double Balance, double annualInterestRate, Date dateCreated){
		this.Balance = Balance;
		this.ID = ID;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = java.util.Date();
	}
	public Account(){
		this.Balance = 0;
		this.ID = 0;
		this.annualInterestRate = 0;
	}

public void deposit(double amount){
	amount += Balance;
}
public void withdraw(double amount){
	if (amount <= Balance)
	{
		Balance -= amount;
	}
	else
	{
		double needs = amount - Balance;
		throw new InsufficientFundsException(needs);
	}
}

public double getMonthlyInterestRate(double monthlyRate){
	monthlyRate = annualInterestRate/12;
	return monthlyRate;
}
}
	
