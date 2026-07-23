package Com.constructor;

public class BankAccount {
private int accountNumber;
private String accountHolder;
private  double balance;

public BankAccount(int accountNumber,String accountHolder,double balance)
{
	this.accountNumber=accountNumber;	
	this.accountHolder=accountHolder;
	this.balance=balance;
	}
public void setBalance(double Balance)
{
	this.balance=Balance;
}
public int getAccountNumber()
{
	return accountNumber;
}
public String getAccountHolder()
{
	return accountHolder;
}
public double getBalance()
{
	return balance;
}
public void deposit(double amount)
{
	balance=balance+amount;
	System.out.println("amount deposit:"+amount);
	System.out.println("current balance:"+balance);
}
	public void withdraw(double amount)
	{
		
		if(balance>=amount)
		{
		balance=balance-amount;
			System.out.println("Sufficient balance");
			System.out.println("amount withdraw:"+amount);
			System.out.println("remaining balance:"+balance);
		}
		else 
		{
		System.out.println("Insufficient balance");	
	
		}
		
	
	
}


}
