import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest3 {
	BankAccount bankacc;
	@Before
	public void setUp() throws Exception {
		bankacc =new BankAccount(10000,"Abhilasha",5000);
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		bankacc.withdraw(1600);
		assertEquals(8400,bankacc.balance);
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		bankacc.deposit(500);
		assertEquals(10500,bankacc.balance);
	}

	
	@Test
	public void testGetAccountNumber() {
		//fail("Not yet implemented");
	}

}
