package whilelooppractice;

public class Example {
   public void isPalindrome()
   {
	   int num=121;
	   int temp=num;
	   int rev=0;
	   while(num!=0)
	   {
		   int rem=num%10;
		    rev=rev*10+rem;
		    num=num/10;
	   }
	   if(temp==rev)
	   {
		   
	   
	   System.out.println("is palindrome");
	   }
	   else
	   {
		   System.out.println("is ! palindrome");
	   }
   }
       public static void main(String[] args) {
    		Example e=new Example();
    		e.isPalindrome();
    		}
    	}


