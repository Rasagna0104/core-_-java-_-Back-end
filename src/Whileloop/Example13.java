package Whileloop;

public class Example13 {
  public boolean isAutomorphic(int num)
  {
	 int square=num*num;
	 int temp=num;
	 while(temp!=0)
	 {
		 if(temp%10!=square%10)
		 {
		return false;
		 }
		 temp =temp/10;
		 square=square/10;
	 }
	 return true;
  }
	public static void main(String[] args) {
Example13 e= new Example13();
System.out.println(e.isAutomorphic(5)?"is Automorphic":"is ! Automorphic");
System.out.println(e.isAutomorphic(7)?"is Automorphic":"is ! Automorphic");
	}

}
