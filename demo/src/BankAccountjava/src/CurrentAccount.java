
public class CurrentAccount extends BankAccount {

	public CurrentAccount(int balance, String customerName, int accountNumber) {
		super(balance, customerName, accountNumber);
		// TODO Auto-generated constructor stub
	}
	int overdraft=1000;
	
	public int withdraw(double balance){
		if(this.balance-balance>=-getoverdraft()) {
			this.balance=(int) (this.balance-balance);
		}else{
			System.out.println("overdraft canot be done" );
		}
		return withdraw(0.2);
		}
		public int getoverdraft(){
		return overdraft;
		}
	}
