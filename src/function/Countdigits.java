package function;

public  class Countdigits {
public  static int countDigits(int n)
{
 if(n==0)
 {
	 return 1;
 }
 n=Math.abs(n);
 int count =0;
 while(n>0) {
 count++;
 n=n/10;
 }
return count;

}

public static void main(String[] args) {

System.out.println("Enter a number:");

int result=countDigits(123445789);
System.out.println(result);


}
}
