package Whileloop;

public class Example1 {
      public void printReverse(int num)
      {
    	 int i=num;
    	  int rev=0;
    	  while(i!=0)
    	  {
    	  int rem=i%10;
    	  rev=rev*10+rem;
    	  i=i/10;
    	  }
    	  System.out.println("Reverse num:"+rev);
      }
	
	
	public static void main(String[] args) {
      Example1 e=new Example1();
      e.printReverse(45678);		
		
	}

}
