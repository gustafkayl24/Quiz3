import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		 Account c = new Account(20000);
	     
	      try
	      {
	    	 System.out.println("You are depositing $3,000...");
		     c.deposit(3000.00);
	         System.out.println("You are withdrawing $2500...");
	         c.withdraw(2500.00);
	      }catch(InsufficientFundsException e)
	      {
	         System.out.println("Sorry, but your request could not be complete due to not enough funds"
	              + e.getAmount());
	         	  e.printStackTrace();
	      }
	         
	}

}
