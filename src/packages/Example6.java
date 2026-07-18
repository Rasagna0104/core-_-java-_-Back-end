package packages;

public class Example6 {

	public static void main(String[] args) {
		int num=5;
  for(int i=1;i<=num;i++)//i=1(1=0,1=1,1=2,1=3,1=4,1=5)
  {                      //i=2(2=0,2=1,2=2,2=3,2=4,2=5)
	                     //i=3(3=0,3=1,3=2,3=3,3=4,3=5)
	                     //i=4(4=0,4=1,4=2,4=3,4=4,4=5)
	                     //i=5(5=0,5=1,5=2,5=3,5=4,5=5)
	  for(int j=1;j<=num;j++)
	  {
		  if(i==j)
		  {
			  System.out.print(j);
		  }
		  System.out.print(0);
	  }
	  
	  System.out.println();
	    
	  }
  }
	}      // 2//10000
            //02000
            //00300
            //00040
            //00005
//1//11111
//01111
//00111
//00011
//00001