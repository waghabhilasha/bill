
public class BankClient {

	private static BankAccount c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BankAccount b=new BankAccount(100,"Abhilasha",5000);
	SavingAccount s=new SavingAccount(200,"A",3000);
		
	b.deposit(1000);
	b.withdraw(2000);
	s.deposit(2000);
	s.setrateofintrest();
	c = null;
	c.withdraw(4000);	
	c.deposit(13000);
	}
}










/*
BankAccount  newAccount = new BankAccount(100,"Abhi",3000);
BankAccount  oldAccount = new BankAccount(200,"Priya",5000);
newAccount.deposit(200);
newAccount.withdraw(100);
oldAccount.deposit(3000);
oldAccount.withdraw(5000);
newAccount.setAccountNumber(342);
oldAccount.Transfer(100, newAccount);
System.out.println(newAccount.getBalance());
System.out.println("A/c no       :"+newAccount.getAccountNumber());	
System.out.println("A/c Balance  :"+newAccount.getBalance());*/