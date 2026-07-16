package Whileloop;

public class Example14 {
   public boolean isHarshad(int num)
   {
	   if(num<=0)
	   {
		   return false;
	   }
	   int temp=num;
	   int sum=0;
	   while(temp!=0)
	   {
		 int rem=temp%10;
		 sum=sum+rem;
		 temp=temp/10;
	   }
	   return temp%sum==0;
   }
   public static void main(String[] args) {
	   Example14 e=new Example14();
	   System.out.println(e.isHarshad(12)?"is Harshad":"is ! Harshad");

	}

}
