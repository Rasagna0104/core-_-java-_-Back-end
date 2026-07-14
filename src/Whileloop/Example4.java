package Whileloop;

public class Example4 {

	public static void main(String[] args) {
     int num=4510;
     int count=0;
     while(num!=0)
     {
    	 count++;
    	 num=num/10;
     }
     System.out.println("count of digits:"+count);
	}

}
