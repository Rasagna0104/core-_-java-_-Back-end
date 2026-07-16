package Whileloop;


public class Example11 {
	public boolean isSpyNumber(int num)
	{
	
		int sum=0;
		int product=1;
		while(num!=0)
		{
		int rem=num%10;
		sum =sum+rem;
		product=product*rem;
		num=num/10;
			
			
		}
		return sum==product;
		
	}

	public static void main(String[] args) {
    Example11 e=new Example11();
    System.out.println(e.isSpyNumber(6)?"is Spy Number":"is! Spy Number");
    System.out.println(e.isSpyNumber(8)?"is Spy Number":"is! Spy Number");
    System.out.println(e.isSpyNumber(10)?"is Spy Number":"is! Spy Number");
	}

}
