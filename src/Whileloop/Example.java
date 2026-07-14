package Whileloop;

public class Example {
	public void Armstrong(int num)
	{
		int original=num;
		int temp=num;
		int digit=0;
		while(temp!=0)
		{
			digit++;
			temp =temp/10;
			
		}
	 temp=num;
	 int sum=0;
	 while(temp!=0)
	 {
		  int rem=temp%10;
		 sum+=(int)Math.pow(rem,digit);
		 temp= temp/10;
		 
	 }
	 if(sum==original)
	 {
		 System.out.println(original+"is an Armstrong number:");
		
	 }
	 else
	 {
		 System.out.println(original+"is not an Armstrong number:");
	 }
	 
	}
	public static void main (String[] args)
	{
		Example e=new Example();
		e.Armstrong(153);
		e.Armstrong(9784);
		e.Armstrong(547)	;	
	}
	}
	
	
	
	
	
	
	

	
