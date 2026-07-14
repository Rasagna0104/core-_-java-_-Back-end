package Whileloop;

public class Example7 {
     public int getCount(int num)
     {
    
    	 int count=0;
    	 while(num!=0)
    	 {
    	 count++;
    	 num=num/10;
    	 }
    	 return count;
     }
    	 public int getPower(int base,int exp)
    	 {
    	 int power=1;
    	 for(int i=1;i<=3;i++)
    	 {
      power=base*power;
    	 }
    	 return power;
    	 }
    	 public boolean isAmstrong(int num)
    	 {
    		 
    	 int count=getCount(num);
    	 int temp=num;
    	 int sum=0;
    	 while(num!=0)
    	 {
    		 int base=num%10;
    		 sum=sum+getPower(base,count);
    		 num=num/10;
    		 
    	 }
    	 return temp==sum;
    	 }
    		 
    	

    	 
    	 
     
	public static void main(String[] args) {
		Example7 e=new Example7();
	     for(int i=100;i<200;i++)
	     {
	    	 if(e.isAmstrong(i))
	    			 {
	    		 System.out.println(i);
	    			 }
	     }
   
	}

}
