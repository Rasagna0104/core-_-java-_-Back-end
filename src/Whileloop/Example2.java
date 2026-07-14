package Whileloop;

public class Example2 {

	public static void main(String[] args) {
       int i=123456789;
       int rev=0;
       while(i!=0)
       {
    	   int rem=i%10;
    	    rev=rev*10+rem;
    	    i=i/10;
    	    
       }
       System.out.println("reverse number:"+rev);
	}
}
