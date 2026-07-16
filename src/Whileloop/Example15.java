package Whileloop;

public class Example15 {
public boolean isSunny(int num)
{
	int a=num+1;
	double root=Math.sqrt(a);
	if(root*root==a)
	{
		System.out.println("true");
	
	}
	

	 return true;
}
	
	
	
	
	

	
	
	public static void main(String[] args) {
		 Example15 e=new Example15();
		 System.out.println(e.isSunny(3)?"is Sunny":"is ! Sunny");
	}

}
