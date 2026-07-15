package Whileloop;

public class Example9 {
   public boolean isUgly(int num)
   {

	   {
		 if (num<=0)
		 {
			 return false;
		 }
		 while (num%2==0) {
			 num =num/2;
		 
			 return true;
			 
		 }
		 while(num%3==0)
		 {
			 num=num/3;
		 
			 return true;
		 }
		 while(num%5==0)
		 {
			 num=num/5;
			 return true;
			 
		 }
		 return num==1;
	   }
	}
	   public boolean isHarshadNumber(int num)
	   { 
		   if(num<=0)
		   {
			   return false;
		   }
		   int temp=num;
	   
		   int sum=0;
		   {
		   while(num!=0)
		   {
		      int rem=num%10;
		      sum=sum+rem;
		      num=num/10;
		   }
		   return temp%sum==0;
		   }
		   }
	   
	
   
     
			 
	public static void main(String[] args) {
		Example9 e=new Example9();
	System.out.println(e.isUgly(15));

System.out.println(e.isHarshadNumber(18));
System.out.println(e.isHarshadNumber(20));
	}

}
