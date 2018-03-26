
public class BankAccount {
	int balance;
	public BankAccount(int balance, String customerName, int accountNumber, int transfer) {
		super();
		this.balance = balance;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.transfer = transfer;
	}
	String customerName;
	int accountNumber;
	int transfer;
	public int withdraw(int amount) {
		if(this.balance-amount < 1000){
			System.out.println("not enough balance");
			return 0;
		}else{
			this.balance=this.balance- amount;
			System.out.println("success");
			return 1;
		}
	}
	public void Transfer(int amount,BankAccount Account) {
		if(this.withdraw(amount)!= 0){
			Account.deposit(amount-amount*5/100);
		}else
			System.out.println("transfer succesful");
	}
	public BankAccount(int balance, String customerName, int accountNumber) {
		super();
		this.balance = balance;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int balance) {
		this.setBalance(this.getBalance()+balance);
	}
	public void getBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}