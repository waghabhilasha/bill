
public class SavingAccount extends BankAccount {

	public SavingAccount(int balance, String customerName, int accountNumber) {
		super(balance, customerName, accountNumber);
		// TODO Auto-generated constructor stub
	}

		static double rateofintrest=0.5;
		
		public double getrateofintrest(){
			return rateofintrest;
		}
		public double calculateintrest(){				//method
		return this.getrateofintrest()*this.balance;	
	}
		public double setrateofintrest(){
			return this.balance=(int)(this.balance+this.calculateintrest());
		}
		public void printStatement() {
			// TODO Auto-generated method stub	
		}
		public static Object getSavingAccount() {
			// TODO Auto-generated method stub
			return null;
		}	
}
