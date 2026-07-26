package function;

public class Primenumbers {
   public static void prime_Number(int start, int end)
   {
	   for(int n=start;n<=end;n++)
	   {
	if(n<=1)
	  {
		continue;
	  }
		 
		   boolean isPrime =true;
	  
	for(int i=2;i<n;i++)
	   {
		  if(n%i==0)
		  {
			  isPrime=false;
			  break;
		  }
	   }
		  if(isPrime) 
			  
	   
	   {
		   System.out.println(n);
		   
	   }
		   
	   }
	  
	  }
	   
   
	
	
	public static void main(String[] args) {
int start=10;
int end =30;
System.out.println("Prime Number are:");
prime_Number(start,end);
	}

}
