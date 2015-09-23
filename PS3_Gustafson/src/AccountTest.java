import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account checking;
@Before
public void setUp()throws Exception {
	checking = new Account(1122,20000);
}
@After
public void tearDown()throws Exception {
	checking = null;
}	

@Test
public final void testWithdraw() throws InsufficientFundsException 
	{
	checking.withdraw(2500);
	System.out.println(checking.getBalance());
	assertTrue("The final is not $17500.00",(double)checking.getBalance()==(double)17500);
    
}

@Test
public final void testDeposit(){

		checking.deposit(3000);
		assertTrue("The final is not $23,000.00", checking.getBalance()==23000);
	}

}