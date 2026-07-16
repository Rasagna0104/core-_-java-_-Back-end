package Whileloop;

public class Example12 {
 public boolean isDuck(int num)
 {
	 while(num!=0)
	 {
		 int rem=num%10;
		 {
			 if(rem==0)
			 {
				 return true;
			 }
			 num=num/10;
		 }
	 }
		 return false;
	 }
 
	public static void main(String[] args) {
		 Example12 e=new Example12();
		 System.out.println(e.isDuck(1230)?"is Duck":"is ! not Duck" );
		 System.out.println(e.isDuck(123)?"is Duck":"is ! not Duck" );
	
	
	}

}
