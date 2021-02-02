package composite;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		DepositAccount account1 = new DepositAccount(111, 1000);
		DepositAccount account2 = new DepositAccount(112, 1500);
		SavingAccount accoun3 = new SavingAccount(1111, 20000);
		Composite c = new Composite();
		c.addAccount(account1);
		c.addAccount(account2);
		c.addAccount(accoun3);
		System.out.println(c.getBalance());
		System.out.println(account1.balance);

	}

}

class SavingAccount implements Account{
	
	//String accountName;
	long accountNumber;
	long balance;


	public SavingAccount(long accountNumber, long balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public long getBalance() {
		return this.balance;
	}
}

class DepositAccount implements Account{

	long accountNumber;
	long balance;


	public DepositAccount(long accountNumber, long balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public long getBalance() {
		return this.balance;
	}
	
	
}

class Composite implements Account{
	
	long balance;
	List<Account> list = new ArrayList<Account>();
	
	public void addAccount(Account acc) {
		list.add(acc);
		
	}

	@Override
	public long getBalance() {
		
		for(Account a:list) {
			
			balance = balance+a.getBalance();
			
			
		}
		return balance;
	}
	
	
}

interface Account{
	
	long getBalance();
	
}







