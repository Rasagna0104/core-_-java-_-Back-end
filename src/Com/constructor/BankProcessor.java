package Com.constructor;

public class BankProcessor {

	public static void main(String[] args) {
     BankAccount b=new BankAccount(450879127,"rasagna",100000);
     System.out.println("Bank accountNumber:"+b.getAccountNumber());
     System.out.println("accountHolder:"+b.getAccountHolder());
    	System.out.println("balance:"+b.getBalance());
    	
    	b.deposit(50000);

   b.withdraw(20000);
 
	}

}
