package function;

public class Factors{
	public static  void factorNumber(int n)
{
System.out.println("Factor of"+n+"are:");		

for(int i=1;i<=n;i++)

{

	if(n%i==0)
{
		

System.out.println(i+" ");
		 }
}
}
	public static void main(String[] args) {
		factorNumber(24);
		
	 
	}
		
		
		
	}


