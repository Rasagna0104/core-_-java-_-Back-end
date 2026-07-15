package Whileloop;

public class Example10 {
    public boolean isPerfect(int num)
    {
    	if(num<=0)
 
    {
    		return false;
    }
    int sum=0;
    	for( int i=1;i<num;i++)
    	{
    		if(num%i==0)
    		{
    			sum=sum+i;
    		}
    		
    	
    }
    		return sum==num;
    	}
    
    
    
    		
    
	
	
	
	
	
	public static void main(String[] args) {
Example10 e=new Example10();
System.out.println(e.isPerfect(6));
System.out.println(e.isPerfect(100));

	}

}
