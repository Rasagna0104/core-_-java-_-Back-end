package whilelooppractice;

public class Example1 {
public void isArmStrong()
{
	int num=153;
	int a=num;
	int temp=num;
   int count=0;
	while(temp!=0)
	{
		int rem=temp%10;
		count++;
		temp=temp/10;
	}

 temp=num;
 int sum=0;
	while(temp!=0)
	{
	int rem=temp%10;
    sum+=(int)Math.pow(rem,count);
    temp=temp/10;			
	}
	if(a==sum)
	{
		System.out.println(a+" is armstrong");
	}
	else
	{
		System.out.println(a+"is ! armstrong");
	}
}
	public static void main(String[] args) {
         Example1 e=new Example1();
         e.isArmStrong();
		
		
		
		
		

	}

}
