package Whileloop;

public class Example6 {
	public void isNeon(int num)
	{
		  
	      int temp=num;
	      int square=num*num;
	      int sum=0;
	      while(square!=0)
	      {
	       int rem=square%10;
	     sum= sum+rem;
	     square=square/10;
	      }
	     
	    	 if(sum==temp)
	    	 {
	    		 System.out.println(9);
	    		 System.out.println("is neon number:");
	    	 }
	    	 else 
	    	 {
	    		 System.out.println("is ! neon number:");
	    	 }
	     }
	 
	    	 	      
	    	 	

	    	 	
	

	public static void main(String[] args) {
    Example6 e=new Example6();
    e.isNeon(9);
	}
}
